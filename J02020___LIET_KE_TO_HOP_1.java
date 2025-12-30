import java.util.*;

public class J02020___LIET_KE_TO_HOP_1{
    static long cnt = 0;

    public static void solve(int[] a, int n, int k, int idx, int start){
        for (int i = start; i <= n; ++i){
            a[idx] = i;
            if (idx == k - 1){
                for (int j = 0; j < k; ++j){
                    System.out.printf("%d ", a[j]);
                }
                System.out.println();
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
        for (int i = 0; i < k; ++i){
            a[i] = i + 1;
        }
        solve(a, n, k, 0, 1);
        System.out.printf("Tong cong co %d to hop", cnt);
        sc.close();
    }
}