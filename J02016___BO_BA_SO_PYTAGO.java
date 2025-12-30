import java.util.*;

public class J02016___BO_BA_SO_PYTAGO{
    public static String res(long[] a){
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 2; --i){
            int left = 0, right = i - 1;
            while (left <= right){
                long S = a[left] * a[left] + a[right] * a[right];
                if (S == a[i] * a[i]){
                    return "YES";
                } else if (S < a[i] * a[i]){
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            System.out.println(res(a));
        }
        sc.close();
    }
}