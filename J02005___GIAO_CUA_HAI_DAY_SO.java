import java.util.Scanner;
import java.util.Arrays;

public class J02005___GIAO_CUA_HAI_DAY_SO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; ++i){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int idx1 = 0, idx2 = 0, temp = -1;
        while (idx1 < n && idx2 < m){
            if (a[idx1] == b[idx2]){
                if (a[idx1] != temp){
                    System.out.printf("%d ", a[idx1]);
                    temp = a[idx1];
                }
                ++idx1;
                ++idx2;
            } else if (a[idx1] > b[idx2]){
                ++idx2;
            } else {
                ++idx1;
            }
        }
        sc.close();
    }
}