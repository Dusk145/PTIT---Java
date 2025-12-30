import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Subject{
    String code, name;
    int credit;

    Subject(String Code, String Name, int Credit){
        this.code = Code;
        this.name = Name;
        this.credit = Credit;
    }

    public String toString(){
        return code + " " + name + " " + String.valueOf(credit);
    }

    public String getName(){
        return this.name;
    }
}

public class J07034___DANH_SACH_MON_HOC{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            List <Subject> a = new ArrayList<>();
            while (n-- > 0){
                sc.nextLine();
                String Code = sc.nextLine(), Name = sc.nextLine();
                int Credit = sc.nextInt();
                a.add(new Subject(Code, Name, Credit));
            }
            Collections.sort(a, new Comparator<Subject>(){
                @Override
                public int compare(Subject x, Subject y){
                    return x.getName().compareTo(y.getName());
                }
            });
            for (Subject i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}