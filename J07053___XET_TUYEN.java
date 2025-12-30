import java.util.*;
import java.io.*;

class Person{
    String code, name, status;
    int year_old, mark;

    Person(int ID, String Name, int Year_old, int Mark, String Status){
        this.code = String.format("PH%02d", ID);
        this.name = Name;
        this.year_old = Year_old;
        this.mark = Mark;
        this.status = Status;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.valueOf(this.year_old) + " " + String.valueOf(this.mark) + 
            " " + this.status;
    }
}

public class J07053___XET_TUYEN{
    public static String correct_name(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static double bonus(double x, double y){
        if (x >= 8.0 && y >= 8.0){
            return 1.0;
        } else if (x >= 7.5 && y >= 7.5){
            return 0.5;
        }
        return 0.0;
    }

    public static String check(int x){
        if (x < 5){
            return "Truot";
        } else if (x <= 6){
            return "Trung binh";
        } else if (x == 7){
            return "Kha";
        } else if (x == 8){
            return "Gioi";
        } 
        return "Xuat sac";
    }

    public static String correct_time(String s){
        StringBuilder res = new StringBuilder(s);
        if (res.charAt(1) == '/'){
            res.insert(0, "0");
        }
        if (res.charAt(4) == '/'){
            res.insert(3, "0");
        }
        return res.toString();
    }

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("XETTUYEN.in"));
            int n = sc.nextInt();
            List <Person> a = new ArrayList<>();
            for (int i = 1; i <= n; ++i){
                sc.nextLine();
                String Name = sc.nextLine().trim(), Birth = sc.nextLine().trim();
                double mark1 = sc.nextDouble(), mark2 = sc.nextDouble();
                int Year_old = 2021 - Integer.parseInt(Birth.split("/")[2]);
                int Mark = (int)Math.round((mark1 + mark2) / 2 + bonus(mark1, mark2));
                if (Mark > 10){
                    Mark = 10;
                }
                a.add(new Person(i, correct_name(Name), Year_old, Mark, check(Mark)));
            }
            for (Person i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}