import java.util.*;
import java.io.*;

public class J07006___SO_KHAC_NHAU_TRONG_FILE_3{
    public static void main(String[] args) throws Exception{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> a = (ArrayList <Integer>) o.readObject();
        int[] b = new int[1000];
        for (int i : a){
            ++b[i];
        } 
        for (int i = 0; i < b.length; ++i){
            if (b[i] > 0){
                System.out.println(i + " " + b[i]);
            }
        }
        o.close();
    }
}