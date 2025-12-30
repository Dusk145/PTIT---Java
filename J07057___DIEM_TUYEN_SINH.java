import java.util.*;
import java.io.*;

class Student3{
    String code, name, status;
    double mark;

    Student3(int ID, String Name, double Mark, String Status){
        this.code = String.format("TS%02d", ID);
        this.name = Name;
        this.mark = Mark;
        this.status = Status;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.format("%.1f", this.mark) + " " + this.status;
    }

    public double getMark(){
        return this.mark;
    }

    public String getCode(){
        return this.code;
    }
}

public class J07057___DIEM_TUYEN_SINH{
    public static String correct_name(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static double bonus(String s, int x){
        double res = 0;
        if (x == 1){
            res += 1.5;
        } else if (x == 2){
            res += 1;
        }
        if (!s.equals("Kinh")){
            res += 1.5;
        }
        return res;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        ArrayList <Student3> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            sc.nextLine();
            String Name = correct_name(sc.nextLine().trim());
            double mark = sc.nextDouble();
            sc.nextLine();
            String Type = sc.nextLine();
            int temp = sc.nextInt();
            double Mark = mark + bonus(Type, temp);
            String Status = (Mark >= 20.5) ? "Do" : "Truot";
            a.add(new Student3(i, Name, Mark, Status));
        }
        Collections.sort(a, new Comparator <Student3> (){
            public int compare(Student3 x, Student3 y){
                if (x.getMark() == y.getMark()){
                    return x.getCode().compareTo(y.getCode());
                }
                return Double.compare(y.getMark(), x.getMark());
            }
        });
        for (Student3 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}