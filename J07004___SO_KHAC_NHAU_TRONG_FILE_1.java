import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07004___SO_KHAC_NHAU_TRONG_FILE_1{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            TreeMap <Integer, Integer> a = new TreeMap<>();
            while (sc.hasNext()){
                int n = sc.nextInt();
                a.put(n, a.getOrDefault(n, 0) + 1);
            }
            for (int i : a.keySet()){
                System.out.printf("%d %d\n", i, a.get(i));
            }
            sc.close();
        } catch(FileNotFoundException e){
        }
    }
}