import java.util.*;
import java.io.*;

class Student1{
    String code, name;
    double priority, total;

    Student1(String Code, String Name, double Priority, double Total){
        this.code = Code;
        this.name = Name;
        this.priority = Priority;
        this.total = Total;
    }

    public double getTotal(){
        return this.total;
    }

    public String getCode(){
        return this.code;
    }

    public String toString(){
        return this.code + " " + this.name + " " + 
            (this.priority == (int)this.priority ? String.format("%d", (int)this.priority) : String.format("%.1f", this.priority)) + " " +
            (this.total == (int)this.total ? String.format("%d", (int)this.total) : String.format("%.1f", this.total));
    }
}

public class J07052___DANH_SACH_TRUNG_TUYEN{
    public static double pri(String s){
        if (s.charAt(2) == '1'){
            return 0.5;
        } else if (s.charAt(2) == '2'){
            return 1.0;
        }
        return 2.5;
    }

    public static String correct_name(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = sc.nextInt();
            List <Student1> a = new ArrayList<>();
            while (n-- > 0){
                sc.nextLine();
                String Code = sc.nextLine().trim(), Name = sc.nextLine().trim();
                double Priority = pri(Code);
                double mark1 = sc.nextDouble(), mark2 = sc.nextDouble(), mark3 = sc.nextDouble();
                double Total = Priority + (mark1 * 2 + mark2 + mark3);
                a.add(new Student1(Code, correct_name(Name), Priority, Total));
            }
            int idx = sc.nextInt();
            Collections.sort(a, new Comparator <Student1> (){
                public int compare(Student1 x, Student1 y){
                    if (x.getTotal() != y.getTotal()){
                        return Double.compare(y.getTotal(), x.getTotal());
                    }
                    return x.getCode().compareTo(y.getCode());
                }
            });
            Student1 x = a.get(idx - 1);
            double maxi = x.getTotal();
            System.out.println(String.format("%.1f", maxi));
            for (int i = 0; i < a.size(); ++i){
                Student1 temp = a.get(i);
                String Status;
                if (temp.getTotal() >= maxi){
                    Status = "TRUNG TUYEN";
                } else {
                    Status = "TRUOT";
                }
                System.out.println(temp + " " + Status);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}