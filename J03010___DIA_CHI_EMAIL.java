import java.util.*;

public class J03010___DIA_CHI_EMAIL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map <String, Integer> cnt = new HashMap<>();
        while (t-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            res.append(a[a.length - 1]);
            for (int i = 0; i < a.length - 1; ++i){
                res.append(a[i].charAt(0));
            }
            String result = res.toString();
            if (cnt.containsKey(result)){
                int temp = cnt.get(result) + 1;
                cnt.put(result, temp);
                System.out.println(result + temp + "@ptit.edu.vn");
            } else {
                cnt.put(result, 1);
                System.out.println(result + "@ptit.edu.vn");
            }
        }
        sc.close();
    }
}