import java.util.*;

public class J02013___SAP_XEP_NOI_BOT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i){
            boolean ok = false;
            for (int j = 0; j < n - 1; ++j){
                if (a[j] > a[j + 1]){
                    int hv = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = hv;
                    ok = true;
                }
            }
            if (ok){
                System.out.printf("Buoc %d: ", i + 1);
                for (int j = 0; j < n; ++j){
                    System.out.printf("%d ", a[j]);
                }
                System.out.println();
            } else {
                break;
            }
        }
        sc.close();
    }
}