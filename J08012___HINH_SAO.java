import java.util.*;

public class J08012___HINH_SAO{
    public static boolean check(int n, int[] a){
        int cnt = 0;
        for (int i = 1; i <= n; ++i){
            if (a[i] == n - 1){
                ++cnt; 
            } else if (a[i] != 1){
                return false;
            }
        }
        if (cnt == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < n; ++i){
            int x = sc.nextInt(), y = sc.nextInt();
            ++a[x];
            ++a[y];
        }
        if (check(n, a)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}