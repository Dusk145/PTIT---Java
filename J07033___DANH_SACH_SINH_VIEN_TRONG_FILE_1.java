import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Student2{
    String code, name, classs, email;

    public String correct(String Name){
        String[] a = Name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; ++i){
            res.append(Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ");
        }
        return res.deleteCharAt(res.length() - 1).toString();
    }

    Student2(String Code, String Name, String Classs, String Email){
        this.code = Code;
        this.name = correct(Name);
        this.classs = Classs;
        this.email = Email;
    }

    public String getCode(){
        return code;
    }

    public String toString(){
        return code + " " + name + " " + classs + " " + email;
    }
}

public class J07033___DANH_SACH_SINH_VIEN_TRONG_FILE_1{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = sc.nextInt();
            sc.nextLine();
            List <Student2> a = new ArrayList<>();
            while (n-- > 0){
                String Code = sc.nextLine(), Name = sc.nextLine(), Classs = sc.nextLine(), Email = sc.nextLine();
                a.add(new Student2(Code, Name, Classs, Email));
            }
            Collections.sort(a, new Comparator<Student2>() {
                @Override
                public int compare(Student2 x, Student2 y) {
                    return x.getCode().compareTo(y.getCode());
                }
            });
            for (Student2 i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}