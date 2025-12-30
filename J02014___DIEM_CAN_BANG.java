import java.util.*;

public class J02014___DIEM_CAN_BANG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long Sright = 0;
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
                Sright += a[i];
            }
            Sright -= a[0];
            boolean ok = false;
            long Sleft = 0;
            for (int i = 1; i < n - 1; ++i){
                Sleft += a[i - 1];
                Sright -= a[i];
                if (Sleft == Sright){
                    System.out.println(i + 1);
                    ok = true;
                    break;
                }
            }
            if (!ok){
                System.out.println(-1);
            }
        }
        sc.close();
    }
}