import java.util.*;

public class J02009___XEP_HANG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; ++i){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        long S = a[0][0] + a[0][1];
        for (int i = 1; i < n; ++i){
            if (S < a[i][0]){
                S = a[i][0] + a[i][1];
            } else {
                S += a[i][1];
            }
        }
        System.out.println(S);
        sc.close();
    }
}