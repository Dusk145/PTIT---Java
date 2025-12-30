import java.util.*;

public class J03022___XU_LI_VAN_BAN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()){
            s += sc.nextLine();
        }
        String[] a = s.trim().toLowerCase().split("[.?!]");
        for (int  i = 0; i < a.length; ++i){
            a[i] = a[i].trim();
            a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            for (String j : a[i].split("\\s+")){
                System.out.printf("%s ", j);
            }
            System.out.println("");
        }
        sc.close();
    }
}