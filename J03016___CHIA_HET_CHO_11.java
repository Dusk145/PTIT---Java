import java.util.*;

public class J03016___CHIA_HET_CHO_11{
    public static void solve(String s){
        long Sc = 0, Sl = 0;
        for (int i = 0; i < s.length(); ++i){
            if (i % 2 == 0){
                Sl += s.charAt(i) - '0';
            } else {
                Sc += s.charAt(i) - '0';
            }
        }
        if ((Sl - Sc) % 11 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            solve(s);
        }
        sc.close();
    }
}