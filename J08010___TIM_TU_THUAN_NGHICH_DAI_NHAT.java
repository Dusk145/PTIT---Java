import java.util.*;

public class J08010___TIM_TU_THUAN_NGHICH_DAI_NHAT{
    public static boolean check(String a){
        return a.equals(new StringBuilder(a).reverse().toString());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        LinkedHashMap <String, Integer> a = new LinkedHashMap<>();
        int maxi = 0;
        while (sc.hasNext()){
            String b = sc.next();
            if (check(b) && b.length() >= maxi){
                a.put(b, a.getOrDefault(b, 0) + 1);
                maxi = Math.max(maxi, b.length());
            }
        }
        for (String i : a.keySet()){
            if (i.length() == maxi){
                System.out.printf ("%s %d\n", i, a.get(i));
            }
        }
        sc.close();
    }
}