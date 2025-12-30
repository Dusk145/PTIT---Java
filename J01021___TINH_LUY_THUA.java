import java.util.Scanner;

public class J01021___TINH_LUY_THUA{
    static final long mod = 1000000007;

    public static long res(long a, long b){
        if (b == 0){
            return 1;
        }
        if (b == 1){
            return a % mod;
        }
        long temp = 1;
        while (b > 0){
            if (b % 2 == 1){
                temp = (temp * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return temp % mod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println(res(a, b));
        }
        sc.close();
    }
}