import java.util.Scanner;

public class J01017___SO_LIEN_KE{
    public static boolean check(String s){
        for (int i = 0; i < s.length() - 1; ++i){
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            if (a + 1 != b && a - 1 != b){
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