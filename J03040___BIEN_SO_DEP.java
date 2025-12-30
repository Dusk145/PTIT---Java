import java.util.*;

public class J03040___BIEN_SO_DEP{
    public static boolean check1(String s){
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)){
            return true;
        }
        return false;
    }

    public static boolean check2(String s){
        for (int i = 0; i < s.length() - 1; ++i){
            if (s.charAt(i) + 1 != s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean check3(String s){
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            String temp = s.substring(5).replace(".", "");
            if (check1(temp) || check2(temp) || check3(temp)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}