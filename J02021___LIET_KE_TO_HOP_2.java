import java.util.*;

public class J02021___LIET_KE_TO_HOP_2{
    static int cnt = 0;

    public static void solve(int[] a, int n, int k, int idx, int start){
        for (int i = start; i <= n; ++i){
            a[idx] = i;
            if (idx == k - 1){
                for (int j = 0; j < k; ++j){
                    System.out.printf("%d", a[j]);
                }
                System.out.printf(" ");
                ++cnt;
            } else {
                solve(a, n, k, idx + 1, i + 1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        solve(a, n, k, 0, 1);
        System.out.printf("\nTong cong co %d to hop", cnt);
        sc.close();
    }
}