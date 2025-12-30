import java.util.*;

public class J08011___LIET_KE_VA_DEM{
    public static boolean check(String a){
        for (int i = 0; i < a.length() - 1; ++i){
            if (a.charAt(i) > a.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> a = new LinkedHashMap<>();
        while (sc.hasNext()){
            String b = sc.next();
            if (check(b)){
                a.put(b, a.getOrDefault(b, 0) + 1);
            }
        }
        List <Map.Entry <String, Integer>> c = new ArrayList<>(a.entrySet());
        Collections.sort(c, new Comparator <Map.Entry <String, Integer>> (){
            public int compare(Map.Entry <String, Integer> x, Map.Entry <String, Integer> y){
                int cmp = Integer.compare(y.getValue(), x.getValue());
                return cmp;
            }
        });
        for (Map.Entry <String, Integer> i : c){
            System.out.printf("%s %d\n", i.getKey(), i.getValue());
        }
        sc.close();
    }
}