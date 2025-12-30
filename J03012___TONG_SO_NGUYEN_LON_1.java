import java.util.*;

public class J03012___TONG_SO_NGUYEN_LON_1{
    public static String change(String a, int n){
        StringBuilder temp = new StringBuilder();
        for (int i = a.length(); i < n; ++i){
            temp.append("0");
        }
        return temp.append(a).toString();
    }

    public static String[] swap(String a, String b){
        if (a.length() > b.length()){
            return new String[]{a, change(b, a.length())};
        } else if (a.length() == b.length()){
            for (int i = 0; i < a.length(); ++i){
                if (a.charAt(i) < b.charAt(i)){
                    return new String[]{b, a};
                } else if (a.charAt(i) > b.charAt(i)){
                    return new String[]{a, b};
                }
            }
            return new String[]{a, b};
        } else {
            return new String[]{b, change(a, b.length())};
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.next(), b = sc.next();
            String[] s = swap(a, b);
            StringBuilder res = new StringBuilder();
            int temp = 0;
            for (int i = s[0].length() - 1; i >= 0; --i){
                int S = (s[0].charAt(i) - '0') + (s[1].charAt(i) - '0') + temp;
                if (S < 10){
                    temp = 0;
                } else {
                    temp = S / 10;
                    S -= temp * 10;
                }
                res.append(Integer.toString(S));
            }
            System.out.println(res.reverse().toString());
        }
        sc.close();
    }
}