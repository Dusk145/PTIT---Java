import java.util.*;

public class J04004___TONG_PHAN_SO{
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
        long a = sc.nextLong(), b = sc.nextLong();
        long c = sc.nextLong(), d = sc.nextLong();
        long tu = a * d + b * c;
        long mau = b * d;
        long temp = gcd(tu, mau);
        System.out.printf("%d/%d", tu / temp, mau / temp);
        sc.close();
    }
}