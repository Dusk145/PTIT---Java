import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Student6 implements Comparable <Student6>{
    String name;
    long minute;

    Student6(String Name, long Minute){
        this.name = Name;
        this.minute = Minute;
    }

    public int compareTo(Student6 x){
        if (this.minute == x.minute){
            return this.name.compareTo(x.name);
        }
        return Long.compare(x.minute, this.minute);
    }

    public String toString(){
        return this.name + " " + String.valueOf(this.minute);
    }
}

public class J07084___THOI_GIAN_ONLINE_LIEN_TUC{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        ArrayList <Student6> a = new ArrayList<>();
        while (n-- > 0){
            String Name = sc.nextLine(), Start = sc.nextLine(), End = sc.nextLine();
            LocalDateTime start = LocalDateTime.parse(Start, dtf), end = LocalDateTime.parse(End, dtf);
            long Minute = Duration.between(start, end).toMinutes();
            a.add(new Student6(Name, Minute));
        }
        Collections.sort(a);
        for (Student6 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}