import java.util.Scanner;

public class J01007___KIEM_TRA_SO_FIBONACCI {
    public static void fibo(long[] a){
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= 94; ++i){
            a[i] = a[i - 1] + a[i - 2];
        }
    }

    public static void main(String[] args){
        long[] a = new long[95];
        fibo(a);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            boolean ok = false;
            for (int i = 0; i <= 94; ++i){
                if (a[i] == n){
                    System.out.println("YES");
                    ok = true;
                    break;
                } else if (a[i] > n){
                    break;
                }
            }
            if (!ok){
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
