import java.util.*;

public class J02034___BO_SUNG_DAY_SO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int maxi = 0;
        boolean[] check = new boolean[201];
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
            maxi = Math.max(maxi, a[i]);
            check[a[i]] = true;
        }
        boolean ok = true;
        for (int i = 1; i <= maxi; ++i){
            if (!check[i]){
                System.out.println(i);
                ok = false;
            }
        }
        if (ok){
            System.out.println("Excellent!");
        }
        sc.close();
    }
}