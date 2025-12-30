import java.util.*;

public class J02027___KHOANG_CACH_NHO_HON_K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int j = 0;
            long cnt = 0;
            for (int i = 0; i < n; ++i){
                while (j < n && a[j] - a[i] < k){
                    ++j;
                }
                cnt += (j - i - 1);
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}