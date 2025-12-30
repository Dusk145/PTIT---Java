import java.util.*;
import java.io.*;

public class J07040___LIET_KE_THEO_THU_TU_XUAT_HIEN{
    public static void main(String[] args) throws Exception{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        HashSet <String> a = new HashSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList <String> b = (ArrayList <String>)o.readObject();
        for (String i : b){
            String[] temp = i.trim().toLowerCase().split("\\s+");
            for (String j : temp){
                a.add(j);
            }
        }
        StringBuilder res = new StringBuilder();
        HashSet <String> c = new HashSet<>();
        while (sc.hasNext()){
            String temp = sc.next().toLowerCase();
            if (a.contains(temp) && !c.contains(temp)){
                res.append(temp + "\n");
                c.add(temp);
            }
        }
        System.out.println(res.toString());
        o.close();
        sc.close();
    }
}