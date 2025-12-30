import java.util.*;
import java.io.*;

public class J07032___SO_THUAN_NGHICH_TRONG_FILE{
    public static boolean check(int n){
        int rev = 0, ori = n;
        while (n != 0){
            int temp = n % 10;
            if (n % 2 == 0){
                return false;
            }
            rev = rev * 10 + temp;
            n /= 10;
        }
        return ori == rev;
    }

    public static void main(String[] args) throws Exception{
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in")), o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> a1 = (ArrayList <Integer>)o1.readObject(), a2 = (ArrayList <Integer>)o2.readObject();
        int[] b1 = new int[1000000], b2 = new int[1000000];
        for (int i : a1){
            ++b1[i];
        }
        for (int i : a2){
            ++b2[i];
        }
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        for (int i = 100; i < 1000; ++i){
            if (b1[i] > 0 && b2[i] > 0 && check(i)){
                res.append(i).append(" ").append(b1[i] + b2[i]).append("\n");
                ++cnt;
            }
            if (cnt == 10){
                break;
            }
        }
        if (cnt < 10){
            for (int i = 10000; i < 100000; ++i){
                if (b1[i] > 0 && b2[i] > 0 && check(i)){
                    res.append(i).append(" ").append(b1[i] + b2[i]).append("\n");
                    ++cnt;
                }
                if (cnt == 10){
                    break;
                }
            }
        }
        System.out.println(res.toString());
        o1.close();
        o2.close();
    }
}