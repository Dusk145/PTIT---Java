import java.util.*;

public class J03025___XAU_DOI_XUNG{
    public static String res(String s){
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; ++i){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                ++cnt;
            }
            if (cnt > 1){
                return "NO";
            }
        }
        if (cnt == 0 && s.length() % 2 == 0){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(res(s));
        }
        sc.close();
    }
}