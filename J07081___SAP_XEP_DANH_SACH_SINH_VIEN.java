import java.util.*;
import java.io.*;

class Student5{
    String code, name, phone, email;

    Student5(String Code, String Name, String Phone, String Email){
        this.code = Code;
        this.name = Name;
        this.phone = Phone;
        this.email = Email;
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.phone + " " + this.email;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }
}

public class J07081___SAP_XEP_DANH_SACH_SINH_VIEN{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Student5> a = new ArrayList<>();
        while (n-- > 0){
            String Code = sc.nextLine().trim(), Name = sc.nextLine().trim(), Phone = sc.nextLine().trim(), Email = sc.nextLine().trim();
            a.add(new Student5(Code, Name, Phone, Email));
        }
        Collections.sort(a, new Comparator <Student5> (){
            public int compare(Student5 x, Student5 y){
                String[] u = x.getName().split("\\s+"), v = y.getName().split("\\s+");
                if (u[u.length - 1].equals(v[v.length - 1])){
                    if (u[0].equals(v[0])){
                        StringBuilder z = new StringBuilder(), t = new StringBuilder();
                        for (int i = 1; i < u.length - 1; ++i){
                            z.append(u[i] + " ");
                        }
                        for (int i = 1; i < v.length - 1; ++i){
                            t.append(v[i] + " ");
                        }
                        if (z.toString().equals(t.toString())){
                            return x.getCode().compareTo(y.getCode());
                        }
                        return z.toString().compareTo(t.toString());
                    }
                    return u[0].compareTo(v[0]);
                }
                return u[u.length - 1].compareTo(v[v.length - 1]);
            }
        });
        for (Student5 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}