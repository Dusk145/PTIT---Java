import java.util.*;
import java.io.*;

class Subject2{
    String code, name, type1, type2;
    int cnt;

    Subject2(String Code, String Name, int Cnt, String Type1, String Type2){
        this.code = Code;
        this.name = Name;
        this.cnt = Cnt;
        this.type1 = Type1;
        this.type2 = Type2;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.valueOf(this.cnt) + " " + this.type1 + " " + this.type2;
    }

    public String getCode(){
        return this.code;
    }

    public String getType2(){
        return this.type2;
    }
}

public class J07073___DANG_KY_HINH_THUC_GIANG_DAY{
    public static boolean check(String s){
        if (s.equals("Truc tuyen") || s.endsWith(".ptit.edu.vn")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Subject2> a = new ArrayList<>();
        while (n-- > 0){
            String Code = sc.nextLine().trim(), Name = sc.nextLine().trim();
            int Cnt = sc.nextInt();
            sc.nextLine();
            String Type1 = sc.nextLine().trim(), Type2 = sc.nextLine().trim();
            a.add(new Subject2(Code, Name, Cnt, Type1, Type2));
        }
        Collections.sort(a, new Comparator <Subject2> (){
            public int compare(Subject2 x, Subject2 y){
                return x.getCode().compareTo(y.getCode());
            }
        });
        for (Subject2 i : a){
            if (check(i.getType2())){
                System.out.println(i);
            }
        }
        sc.close();
    }
}