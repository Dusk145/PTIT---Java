import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07002___TINH_TONG{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long cnt = 0;
            while (sc.hasNext()){
                try{
                    String a = sc.next();
                    cnt += Integer.parseInt(a);
                } catch(NumberFormatException e){
                }
            }
            System.out.println(cnt);
            sc.close();
        } catch(FileNotFoundException e){
        }
    }
}