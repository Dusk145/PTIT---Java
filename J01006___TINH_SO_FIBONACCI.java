import java.util.Scanner;

public class J01006___TINH_SO_FIBONACCI{
    public static void fibo(long[] a){
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i < 95; ++i){
            a[i] = a[i - 1] + a[i - 2];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] a = new long[95];
        fibo(a);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
        sc.close();
    }
}
