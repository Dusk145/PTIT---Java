import java.util.*;

public class J04001___KHAI_BAO_LOP_POINT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double a = sc.nextDouble(), b = sc.nextDouble();
            double c = sc.nextDouble(), d = sc.nextDouble();
            double res = Math.sqrt((c - a) * (c - a) + (d - b) * (d - b)) * 1.0;
            System.out.printf("%.4f\n", res);
        }
        sc.close();
    }
}