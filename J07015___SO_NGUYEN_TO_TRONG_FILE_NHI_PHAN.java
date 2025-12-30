import java.util.*;
import java.io.*;

public class J07015___SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN{
    public static boolean[] nt = new boolean[10001];

    public static void prime(){
        Arrays.fill(nt, true);
        nt[0] = nt[1] = false;
        for (int i = 2; i * i < 10001; ++i){
            if (nt[i]){
                for (int j = i * i; j < 10001; j += i){
                    nt[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList <Integer> a = (ArrayList <Integer>)o.readObject();
        int[] b = new int[10001];
        prime();
        for (int i : a){
            ++b[i];
        }
        StringBuilder res = new StringBuilder();
        for (int i = 2; i < 10001; ++i) {
            if (b[i] > 0 && nt[i]) {
                res.append(i).append(" ").append(b[i]).append("\n");
            }
        }
        System.out.print(res.toString());
        o.close();
    }
}