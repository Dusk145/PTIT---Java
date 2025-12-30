import java.util.*;

public class J02102___MA_TRAN_XOAN_OC_TANG_DAN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int idx = 0;
        int[][] b = new int[n][n];
        while (h1 <= h2 && c1 <= c2){
            for (int i = c1; i <= c2; ++i){
                b[h1][i] = a[idx];
                ++idx;
            }
            ++h1;
            for (int i = h1; i <= h2; ++i){
                b[i][c2] = a[idx];
                ++idx;
            }
            --c2;
            for (int i = c2; i >= c1; --i){
                b[h2][i] = a[idx];
                ++idx;
            }
            --h2;
            for (int i = h2; i >= h1; --i){
                b[i][c1] = a[idx];
                ++idx;
            }
            ++c1;
        }
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j){
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}