import java.util.*;

public class J02022___SO_XA_CACH{
    static boolean[] check = new boolean[10];

    public static void solve(int[] a, int n, int idx){
        for (int i = 1; i <= n; ++i){
            if (!check[i]){
                a[idx] = i;
                if (idx == n - 1 && Math.abs(a[idx] - a[idx - 1]) != 1){
                    for (int j = 0; j < n; ++j){
                        System.out.printf("%d", a[j]);
                    }
                    System.out.println();
                }
                if (idx == 0 || Math.abs(a[idx] - a[idx - 1]) != 1){
                    check[i] = true;
                    solve(a, n, idx + 1);
                    check[i] = false;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 1; i <= n; ++i){
                check[i] = false;
            }
            solve(a, n, 0);
        }
        sc.close();
    }
}