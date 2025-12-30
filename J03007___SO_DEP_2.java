import java.util.*;

public class J03007___SO_DEP_2{
    public static boolean check(String s){
        if (s.charAt(s.length() - 1) != '8'){
            return false;
        }
        int S = 0;
        for (int i = 0; i < s.length() / 2; ++i){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
            S += (s.charAt(i) - '0');
        }
        if (s.length() % 2 != 0){
            S += (s.charAt(s.length() / 2 + 1) - '0');
        }
        if (S % 10 == 0){
            return true;
        }
        return false;
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