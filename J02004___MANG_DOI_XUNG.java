import java.util.Scanner;

public class J02004___MANG_DOI_XUNG{
    public static boolean check(int[] a){
        for (int i = 0; i < a.length / 2; ++i){
            if (a[i] != a[a.length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            if (check(a)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}