import java.util.Scanner;

public class J01009___TONG_GIAI_THUA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S = 1, temp = 1;
        for (int i = 2; i <= n; ++i){
            temp *= i;
            S += temp;
        }
        System.out.println(S);
        sc.close();
    }
}   