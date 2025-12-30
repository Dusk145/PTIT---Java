import java.util.*;
import java.io.*;

public class J07085___TONG_CHU_SO{
    public static void main(String[] args) throws Exception{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> a = (ArrayList <String>)o.readObject();
        for (String i : a){
            int idx = 0;
            while (i.charAt(idx) < '1' || i.charAt(idx) > '9'){
                ++idx;
            }
            StringBuilder res = new StringBuilder();
            for (int j = idx; j < i.length(); ++j){
                if (i.charAt(j) >= '0' && i.charAt(j) <= '9'){
                    res.append(i.charAt(j));
                }
            }
            int S = 0;
            for (int j = 0; j < res.length(); ++j){
                S += res.charAt(j) - '0';
            }
            res.append(" ").append(S).append("\n");
            System.out.println(res.toString());
        }
        o.close();
    }
}