import java.util.*;
import java.io.*;

public class J07076___SAP_XEP_MA_TRAN{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    a[i][j] = sc.nextInt();
                }
            }
            int[] b = new int[n];
            for (int i = 0; i < n; ++i){
                b[i] = a[i][k - 1];
            }
            Arrays.sort(b);
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < k - 1; ++j){
                    System.out.printf("%d ", a[i][j]);
                }
                System.out.printf("%d ", b[i]);
                for (int j = k; j < m; ++j){
                    System.out.printf("%d ", a[i][j]);
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}