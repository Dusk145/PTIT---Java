import java.util.*;

public class J08022___PHAN_TU_BEN_PHAI_DAU_TIEN_LON_HON{
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
            for (int i = n - 1; i >= 0; --i){
                while (!b.empty()){
                    if (a[i] >= b.peek()){
                        b.pop();
                    } else {
                        break;
                    }
                }
                if (b.empty()){
                    c[i] = -1;
                } else {
                    c[i] = b.peek();
                }
                b.push(a[i]);
            }
            for (int i : c){
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }
        sc.close();
    }
}