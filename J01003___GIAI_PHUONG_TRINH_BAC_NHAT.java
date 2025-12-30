import java.util.Scanner;

public class J01003___GIAI_PHUONG_TRINH_BAC_NHAT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a == 0f){
            if (b == 0f){
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.printf("%.2f\n", (float)(-b / a));
        }
        sc.close();
    }
}
