import java.util.*;

public class J03031___XAU_DAY_DU{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String a = sc.next();
            int k = sc.nextInt();
            HashSet <Character> b = new HashSet<>();
            for (int i = 0; i < a.length(); ++i){
                b.add(a.charAt(i));
            }
            if (b.size() + k >= 26){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}