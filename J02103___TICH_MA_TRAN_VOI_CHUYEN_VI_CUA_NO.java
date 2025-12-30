import java.util.*;

public class J02103___TICH_MA_TRAN_VOI_CHUYEN_VI_CUA_NO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.printf("Test %d:\n", cnt);
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    int temp = 0;
                    for (int k = 0; k < m; ++k){
                        temp += a[i][k] * a[j][k];
                    }
                    System.out.printf("%d ", temp);
                }
                System.out.println("");
            }
            ++cnt;
        }
        sc.close();
    }
}