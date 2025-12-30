import java.util.*;

public class J02011___SAP_XEP_CHON{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; ++i){
            System.out.printf("Buoc %d: ", i + 1);
            int temp = 100000000, idx = -1;
            for (int j = i + 1; j < n; ++j){
                if (temp > a[j]){
                    temp = a[j];
                    idx = j;
                }
            }
            if (a[i] > temp){
                int hv = a[i];
                a[i] = a[idx];
                a[idx] = hv;
            }
            for (int j = 0; j < n; ++j){
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}