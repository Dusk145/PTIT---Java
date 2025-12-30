import java.util.Scanner;

public class J01014___UOC_SO_NGUYEN_TO_LON_NHAT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long temp = 0;
            for (long i = 2; i <= (long)Math.sqrt(n); ++i){
                if (n % i == 0){
                    temp = i;
                    while (n % i == 0){
                        n /= i;
                    }
                }
            }
            if (n != 1){
                temp = n;
            }
            System.out.println(temp);
        }
        sc.close();
    }
}