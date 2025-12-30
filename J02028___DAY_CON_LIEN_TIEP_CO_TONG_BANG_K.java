import java.util.*;

public class J02028___DAY_CON_LIEN_TIEP_CO_TONG_BANG_K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextLong();
            }
            boolean ok = false;
            long S = 0;
            HashSet <Long> b = new HashSet<>();
            b.add(0L);
            for (int i = 0; i < n; ++i){
                S += a[i];
                if (b.contains(S - k)){
                    ok = true;
                    break;
                }
                b.add(S);
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}