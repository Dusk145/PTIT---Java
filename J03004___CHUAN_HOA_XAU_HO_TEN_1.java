import java.util.*;

public class J03004___CHUAN_HOA_XAU_HO_TEN_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String i : a){
                if (i.isEmpty()){
                    continue;
                }
                String temp = i.toLowerCase();
                res.append(Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + " ");
            }
            System.out.println(res);
        }
        sc.close();
    }
}