import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class Exam{
    String code, date, time, room;

    Exam(int ID, String Date, String Time, String Room){
        this.code = String.format("C%03d", ID);
        this.date = Date;
        this.time = Time;
        this.room = Room;
    }

    public String toString(){
        return this.code + " " + this.date + " " + this.time + " " + this.room;
    }

    public String getTime(){
        return this.time;
    }

    public String getDate(){
        return this.date;
    }

    public String getCode(){
        return this.code;
    }
}

public class J07059___DANH_SACH_CA_THI{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Exam> a = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (int i = 1; i <= n; ++i){
            String Date = sc.nextLine().trim(), Time = sc.nextLine().trim(), Room = sc.nextLine().trim();
            a.add(new Exam(i, Date, Time, Room));
        }
        Collections.sort(a, new Comparator <Exam> (){
            public int compare(Exam x, Exam y){
                LocalDateTime u = LocalDateTime.parse(x.getDate() + " " + x.getTime(), dtf);
                LocalDateTime v = LocalDateTime.parse(y.getDate() + " " + y.getTime(), dtf);
                return u.compareTo(v);
            }
        });
        for (Exam i : a){
            System.out.println(i);
        }
        sc.close();
    }
}