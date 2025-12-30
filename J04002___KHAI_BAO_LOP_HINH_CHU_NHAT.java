import java.util.*;

public class J04002___KHAI_BAO_LOP_HINH_CHU_NHAT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String c = sc.next().trim().toUpperCase();
        if (a > 0 && b > 0){
            System.out.printf("%d %d %c%s", (a + b) * 2, a * b, c.charAt(0), c.toLowerCase().substring(1));
        } else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}