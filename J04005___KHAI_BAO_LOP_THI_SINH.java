import java.util.*;

public class J04005___KHAI_BAO_LOP_THI_SINH{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine(), Birth = sc.nextLine();
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.printf("%s %s %.1f", Name, Birth, a + b + c);
        sc.close();
    }
}