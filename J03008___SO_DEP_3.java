import java.util.*;

public class J03008___SO_DEP_3{
    public static boolean nt(char c){
        if (c == '2' || c == '3' || c == '5' || c == '7'){
            return true;
        }
        return false;
    }

    public static boolean check(String s){
        if (s.length() % 2 != 0 && !nt(s.charAt(s.length() / 2 + 1))){
            return false;
        }
        for (int i = 0; i < s.length() / 2; ++i){
            if (!nt(s.charAt(i)) || s.charAt(i) != s.charAt(s.length() - i - 1)){
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
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}