import java.util.*;
import java.io.*;

public class J07030___CAP_SO_NGUYEN_TO_TRONG_FILE_1{
    public static boolean[] nt = new boolean[1000000];

    public static void prime(){
        Arrays.fill(nt, true);
        nt[0] = nt[1] = false;
        for (int i = 2; i * i < 1000000; ++i){
            if (nt[i]){
                for (int j = i * i; j < 1000000; j += i){
                    nt[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> a1 = (ArrayList <Integer>)o1.readObject(), a2 = (ArrayList <Integer>)o2.readObject();
        boolean[] b1 = new boolean[1000000], b2 = new boolean[1000000];
        for (int i : a1){
            b1[i] = true;
        }
        for (int i : a2){
            b2[i] = true;
        }
        prime();
        StringBuilder res = new StringBuilder();
        for (int i = 2; i < 1000000 / 2; ++i){
            int j = 1000000 - i;
            if (nt[i] && b1[i] && nt[j] && b2[j]){
                res.append(i).append(" ").append(j).append("\n");
            }
        }
        System.out.println(res.toString());
        o1.close();
        o2.close();
    }
}