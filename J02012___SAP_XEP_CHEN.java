import java.util.*;

public class J02012___SAP_XEP_CHEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i){
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j < i; ++j){
                if (a[j] > a[i]){
                    int hv = a[i];
                    a[i] = a[j];
                    a[j] = hv;
                }
            }
            for (int j = 0; j <= i; ++j){
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}