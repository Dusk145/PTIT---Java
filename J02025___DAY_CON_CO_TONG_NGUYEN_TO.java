import java.util.*;

public class J02025___DAY_CON_CO_TONG_NGUYEN_TO{
    static boolean[] nok = new boolean[2000];
    static Integer[] a;

    public static void nt(){
        nok[0] = nok[1] = true;
        for (int i = 2; i < 2000; ++i){
            if (!nok[i]){
                for (int j = i * i; j < 2000; j += i){
                    nok[j] = true;
                }
            }
        }
    }

    public static void solve(int n, int idx, int S, String s){
        if (!nok[S]){
            System.out.println(s);
        }
        for (int i = n - 1; i > idx; --i){
            solve(n, i, S + a[i], s + " " + String.valueOf(a[i]));
        }
    }

    public static void main(String[] args){
        nt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            a = new Integer[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, (x, y) -> y - x);
            solve(n, -1, 0, "");
        }
        sc.close();
    }
}