import java.util.*;

public class J04008___CHU_VI_TAM_GIAC{
    public static boolean check(double a, double b, double c){
        if (a + b <= c){
            return false;
        } else if (a + c <= b){
            return false;
        } else if (b + c <= a){
            return false;
        }
        return true;
    }

    public static double cnt(double a, double b, double c, double d){
        return 1.0 * Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double a = sc.nextDouble(), b = sc.nextDouble();
            double c = sc.nextDouble(), d = sc.nextDouble();
            double e = sc.nextDouble(), f = sc.nextDouble();
            double x = cnt(a, b, c, d), y = cnt(a, b, e, f), z = cnt(c, d, e, f);
            if (check(x, y, z)){
                System.out.printf("%.3f\n", x + y + z);
            } else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}