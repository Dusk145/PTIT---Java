import java.util.Scanner;

public class J01013___TONG_UOC_SO_1{
    static int[] a = new int[2000001];
    static long[] b = new long[2000001];

    public static void solve(){
        for (int i = 2; i <= 2000000; ++i){
            if (a[i] == 0){
                for (int j = i; j <= 2000000; j += i){
                    if (a[j] == 0){
                        a[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= 2000000; ++i){
            b[i] = b[i / a[i]] + a[i];
        }
    }

    public static void main(String[] args){
        solve();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long S = 0;
        while (t-- > 0){
            int n = sc.nextInt();
            S += b[n];
        }
        System.out.println(S);
        sc.close();
    }
}