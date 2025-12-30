import java.util.*;
import java.io.*;

class Subject1{
    String code, name, type;

    Subject1(String Code, String Name, String Type){
        this.code = Code;
        this.name = Name;
        this.type = Type;
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.type;
    }

    public String getCode(){
        return this.code;
    }
}

public class J07058___DANH_SACH_MON_THI{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Subject1> a = new ArrayList<>();
        while (n-- > 0){
            String Code = sc.nextLine().trim(), Name = sc.nextLine().trim(), Type = sc.nextLine().trim();
            a.add(new Subject1(Code, Name, Type));
        }
        Collections.sort(a, new Comparator <Subject1> (){
            public int compare(Subject1 x, Subject1 y){
                return x.getCode().compareTo(y.getCode());
            }
        });
        for (Subject1 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}