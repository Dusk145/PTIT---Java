import java.util.*;

public class J03009___TAP_TU_RIENG_CUA_HAI_XAU{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet <String> a = new TreeSet<>(Arrays.asList(s1.split("\\s+")));
            HashSet <String> b = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            for (String i : a){
                if (!b.contains(i)){
                    System.out.printf("%s ", i);
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}