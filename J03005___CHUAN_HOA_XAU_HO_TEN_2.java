import java.util.*;

public class J03005___CHUAN_HOA_XAU_HO_TEN_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            for (int i = 1; i < a.length; ++i){
                if (a[i].isEmpty()){
                    continue;
                }
                String temp = a[i].toLowerCase();
                res.append(Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + " ");
            }
            res.deleteCharAt(res.length() - 1);
            System.out.println(res + ", " + a[0].toUpperCase());
        }
        sc.close();
    }
}