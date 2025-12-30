import java.util.*;

public class J03006___SO_DEP_1{
    public static boolean check(String s){
        for (int i = 0; i < s.length() / 2; ++i){
            if ((s.charAt(i) - '0') % 2 != 0 || s.charAt(i) != s.charAt(s.length() - i - 1)){
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