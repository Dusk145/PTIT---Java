import java.util.*;

public class J03013___HIEU_SO_NGUYEN_LON_1{
    public static String change(String a, int n){
        StringBuilder temp = new StringBuilder();
        for (int i = a.length(); i < n; ++i){
            temp.append("0");
        }
        temp.append(a);
        return temp.toString();
    }

    public static String[] swap(String a, String b){
        if (a.length() < b.length()){
            return new String[]{b, change(a, b.length())};
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
            return new String[]{a, change(b, a.length())};
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.next(), b = sc.next();
            String[] s = swap(a, b);
            int temp = 0;
            StringBuilder res = new StringBuilder();
            for (int i = s[0].length() - 1; i >= 0; --i){
                int x = s[0].charAt(i) - '0', y = s[1].charAt(i) - '0';
                int tmp = x - y - temp;
                if (tmp >= 0){
                    temp = 0;
                } else {
                    tmp += 10;
                    temp = 1;
                }
                res.append(Integer.toString(tmp));
            }
            System.out.println(res.reverse().toString());
        }
        sc.close();
    }
}