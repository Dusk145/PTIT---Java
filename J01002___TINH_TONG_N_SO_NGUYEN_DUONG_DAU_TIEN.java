import java.util.Scanner;

public class J01002___TINH_TONG_N_SO_NGUYEN_DUONG_DAU_TIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextInt();
            System.out.println(((long)(n + 1) * n) / 2);
        }
        sc.close();
    }
}