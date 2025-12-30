import java.util.*;

public class J06007___BANG_TINH_GIO_CHUAN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; ++i){
            String x = sc.nextLine();
        }
        int m = sc.nextInt();
        sc.nextLine();
        HashMap <String, String> a = new HashMap<>();
        for (int i = 0; i < m; ++i){
            String Code = sc.next(), Name = sc.nextLine();
            a.put(Code, Name);
        }
        int k = sc.nextInt();
        sc.nextLine();
        LinkedHashMap <String, Double> b = new LinkedHashMap<>();
        for (int i = 0; i < k; ++i){
            String Tea_code = sc.next(), Sub_code = sc.next();
            double Total = sc.nextDouble();
            b.put(Tea_code, b.getOrDefault(Tea_code, 0.0) + Total);
        }
        for (String i : b.keySet()){
            System.out.println(a.get(i) + " " + String.format("%.2f", b.get(i)));
        }
        sc.close();
    }
}