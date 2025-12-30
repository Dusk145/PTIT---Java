import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Student{
    String code, name, classs, dob;
    double gpa;

    public String correct(String DoB){
        StringBuilder temp = new StringBuilder(DoB);
        if (temp.charAt(1) == '/'){
            temp.insert(0, '0');
        }
        if (temp.charAt(4) == '/'){
            temp.insert(3, '0');
        }
        return temp.toString();
    }

    Student(int cnt, String Name, String Class, String DoB, double GPA){
        this.code = String.format("B20DCCN%03d", cnt);
        this.name = Name;
        this.classs = Class;
        this.dob = correct(DoB);
        this.gpa = GPA;
    }

    public String toString(){
        return code + " " + name + " " + classs + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class J07010___DANH_SACH_SINH_VIEN_TRONG_FILE_2{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            List <Student> a = new ArrayList<>();
            for (int i = 1; i <= n; ++i){
                sc.nextLine();
                String Name = sc.nextLine(), Class = sc.nextLine(), DoB = sc.nextLine();
                double GPA = sc.nextDouble();
                a.add(new Student(i, Name, Class, DoB, GPA));
            }
            for (Student i : a){
                System.out.println(i);
            }
            sc.close();
        } catch(FileNotFoundException e){
        }
    }
}