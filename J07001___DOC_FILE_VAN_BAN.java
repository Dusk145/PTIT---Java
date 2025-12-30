import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07001___DOC_FILE_VAN_BAN{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e){
        }
    }
}