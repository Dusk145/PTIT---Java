import java.util.*;

public class J03024___SO_UU_THE{
    public static boolean check1(String s){
        for (int i = 0; i < s.length(); ++i){
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String s, int a){
        if (s.length() % 2 != a){
            return false;
        }
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i){
            if ((s.charAt(i) - '0') % 2 == a){
                ++cnt;
            }
        }
        if (cnt > s.length() - cnt){
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
            if (s.charAt(0) == '0' || !check1(s)){
                System.out.println("INVALID");
            } else {
                if (check2(s, 0) || check2(s, 1)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}