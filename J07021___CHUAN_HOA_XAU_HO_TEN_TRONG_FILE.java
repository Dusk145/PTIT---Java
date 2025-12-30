import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07021___CHUAN_HOA_XAU_HO_TEN_TRONG_FILE{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNextLine()){
                String a = sc.nextLine().trim();
                if (a.equals("END")){
                    break;
                }
                String[] b = a.toLowerCase().split("\\s+");
                for (int i = 0; i < b.length; ++i){
                    System.out.printf("%c%s ", Character.toUpperCase(b[i].charAt(0)), b[i].substring(1));
                }
                System.out.println("");
            }
            sc.close();
        } catch (FileNotFoundException e){
        }
    }
}