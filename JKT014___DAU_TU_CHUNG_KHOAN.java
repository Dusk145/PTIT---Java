import java.util.*;

public class JKT014___DAU_TU_CHUNG_KHOAN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
            }
            Stack <Integer> b = new Stack<>();
            int[] c = new int[n];
            for (int i = 0; i < n; ++i){
                while (!b.empty() && a[b.peek() - 1] <= a[i]){
                    b.pop();
                }
                if (b.empty()){
                    c[i] = i + 1;
                } else {
                    c[i] = i - b.peek() + 1;
                }
                b.push(i + 1);
            }
            for (int i : c){
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }
        sc.close();
    }
}