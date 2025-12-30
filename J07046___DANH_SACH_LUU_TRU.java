import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Hotel{
    String id, name, code, start, end;
    long day;

    Hotel(int ID, String Name, String Code, String Start, String End){
        this.id = String.format("KH%02d", ID);
        this.name = Name;
        this.code = Code;
        if (Start.equals(End)){
            this.day = 0;
        } else {
            List <Integer> a = change(Start), b = change(End);
            LocalDate come = LocalDate.of(a.get(2), a.get(1), a.get(0));
            LocalDate leave = LocalDate.of(b.get(2), b.get(1), b.get(0));
            this.day = ChronoUnit.DAYS.between(come, leave);
        }
    }

    public List <Integer> change(String s){
        List <Integer> temp = new ArrayList<>();
        temp.add(Integer.parseInt(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(1))));
        temp.add(Integer.parseInt(String.valueOf(s.charAt(3)) + String.valueOf(s.charAt(4))));
        temp.add(Integer.parseInt(s.substring(6)));
        return temp;
    }

    public String toString(){
        return id + " " + name + " " + code + " " + String.valueOf(day);
    }

    public long getDay(){
        return this.day;
    }
}

public class J07046___DANH_SACH_LUU_TRU{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("KHACH.in"));
            int n = sc.nextInt();
            sc.nextLine();
            List <Hotel> a = new ArrayList<>();
            for (int i = 1; i <= n; ++i){
                String Name = sc.nextLine().trim(), Code = sc.nextLine().trim(), Start = sc.nextLine().trim(), End = sc.nextLine().trim();
                a.add(new Hotel(i, Name, Code, Start, End));
            }
            Collections.sort(a, (x, y) -> Long.compare(y.getDay(), x.getDay()));
            for (Hotel i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}