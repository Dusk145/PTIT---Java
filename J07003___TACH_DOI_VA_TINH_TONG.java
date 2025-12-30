import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class J07003___TACH_DOI_VA_TINH_TONG{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            BigInteger a = sc.nextBigInteger();
            while (a.toString().length() != 1){
                int temp = a.toString().length();
                BigInteger x = new BigInteger(a.toString().substring(0, temp / 2));
                BigInteger y = new BigInteger(a.toString().substring(temp / 2, temp));
                a = x.add(y);
                System.out.println(a.toString());
            }
            sc.close();
        } catch(FileNotFoundException e){
        }
    }
}