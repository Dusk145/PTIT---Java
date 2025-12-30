import java.util.*;

public class J03032___DAO_TU{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for (int i = 0; i < a.length; ++i){
                for (int j = a[i].length() - 1; j >= 0; --j){
                    System.out.printf("%c", a[i].charAt(j));
                }
                System.out.printf(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}