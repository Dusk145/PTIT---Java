import java.util.*;

public class J01011___BOI_SO_CHUNG_UOC_SO_CHUNG{
    public static long gcd(long a, long b){
        if (a == 0 || b == 0){
            return a + b;
        }
        while (b != 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long a = sc.nextInt(), b = sc.nextInt();
            long res = gcd(a, b);
            System.out.printf("%d %d\n", (a * b) / res, res);
        }
        sc.close();
    }
}