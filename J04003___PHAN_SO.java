import java.util.*;

public class J04003___PHAN_SO{
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
        long temp = gcd(a, b);
        System.out.printf("%d/%d", a / temp, b / temp);
        sc.close();
    }
}