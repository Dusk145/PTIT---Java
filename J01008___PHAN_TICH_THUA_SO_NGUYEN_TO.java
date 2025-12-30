import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class J01008___PHAN_TICH_THUA_SO_NGUYEN_TO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.printf("Test %d: ", cnt);
            TreeMap <Integer, Integer> a = new TreeMap<>();
            for (int i = 2; i * i <= n; ++i){
                while (n % i == 0){
                    a.put(i, a.getOrDefault(i, 0) + 1);
                    n /= i;
                }
            }
            if (n != 1){
                a.put(n, 1);
            }
            for (Map.Entry <Integer, Integer> i : a.entrySet()){
                System.out.printf("%d(%d) ", i.getKey(), i.getValue());
            }
            System.out.println();
            ++cnt;
        }
        sc.close();
    }
}