import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07022___LOAI_BO_SO_NGUYEN{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            List <String> a = new ArrayList<>();
            while (sc.hasNext()){
                String s = sc.next();
                try {
                    int temp = Integer.parseInt(s);
                } catch (NumberFormatException e){
                    a.add(s);
                }
            }
            Collections.sort(a);
            for (String i : a){
                System.out.printf("%s ", i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}