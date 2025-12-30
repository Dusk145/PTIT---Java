import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07007___LIET_KE_TU_KHAC_NHAU{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("VANBAN.in"));
            TreeSet <String> a = new TreeSet<>();
            while (sc.hasNext()){
                String s = sc.next().trim().toLowerCase();
                a.add(s);
            }
            for (String i : a){
                System.out.printf("%s\n", i);
            }
            sc.close();
        } catch(FileNotFoundException e){
        }
    }
}