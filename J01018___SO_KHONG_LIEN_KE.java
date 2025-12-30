import java.util.Scanner;

public class J01018___SO_KHONG_LIEN_KE{
    public static String res(String s){
        int S = 0;
        for (int i = 0; i < s.length() - 1; ++i){
            S += s.charAt(i) - '0';
            if (s.charAt(i) + 2 != s.charAt(i + 1) && s.charAt(i) - 2 != s.charAt(i + 1)){
                return "NO";
            }
        }
        if ((S + s.charAt(s.length() - 1) - '0') % 10 == 0){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){
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