import java.util.*;
import java.io.*;

public class J07029___SO_NGUYEN_TO_LON_NHAT_TRONG_FILE{
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
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> a = (ArrayList <Integer>)o.readObject();
        int[] b = new int[1000000];
        for (int i : a){
            ++b[i];
        }
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        prime();
        for (int i = 1000000 - 1; i > 1; --i){
            if (b[i] > 0 && nt[i]){
                res.append(i).append(" ").append(b[i]).append("\n");
                ++cnt;
            }
            if (cnt == 10){
                break;
            }
        }
        System.out.println(res.toString());
        o.close();
    }
}