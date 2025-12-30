import java.util.*;

public class J02026___DAY_CON_CO_K_PHAN_TU_TANG_DAN{
    static int[] a;

    public static void solve(int idx, int n, int cnt, int k, String s){
        if (cnt == k){
            System.out.println(s);
            return;
        }
        for (int i = idx; i < n; ++i){
            solve(i + 1, n, cnt + 1, k, s + " " + String.valueOf(a[i]));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            solve(0, n, 0, k, "");
        }
        sc.close();
    }
}