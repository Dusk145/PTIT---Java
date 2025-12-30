import java.util.*;

public class J06008___TINH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap <String, String> a = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            String Code = sc.next(), Name = sc.nextLine().trim();
            a.put(Code, Name);
        }
        int m = sc.nextInt();
        sc.nextLine();
        HashMap <String, String> b = new HashMap<>();
        while (m-- > 0){
            String Code = sc.next(), Name = sc.nextLine().trim();
            b.put(Code, Name);
        }
        int k = sc.nextInt();
        sc.nextLine();
        LinkedHashMap <String, String> c = new LinkedHashMap<>();
        HashMap <String, Double> d = new HashMap<>();
        while (k-- > 0){
            String Code1 = sc.next(), Code2 = sc.next();
            double Total = sc.nextDouble();
            c.put(Code1, c.getOrDefault(Code1, "") + Code2 + " ");
            d.put(Code1 + Code2, Total);
        }
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        res.append("Giang vien: " + b.get(s) + "\n");
        double cnt = 0;
        String[] temp = c.get(s).trim().split("\\s+");
        for (String i : temp){
            res.append(a.get(i) + " ").append(d.get(s + i)).append("\n");
            cnt += d.get(s + i);
        }
        res.append("Tong: " + String.format("%.2f", cnt));
        System.out.println(res.toString());
        sc.close();
    }
}