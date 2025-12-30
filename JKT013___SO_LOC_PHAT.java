import java.util.*;

public class JKT013___SO_LOC_PHAT{
    public static StringBuilder nextt(StringBuilder a){
        for (int i = a.length() - 1; i >= 0; --i){
            if (a.charAt(i) == '6'){
                a.setCharAt(i, '8');
                return a;
            } else {
                a.setCharAt(i, '6');
            }
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            List <String> a = new ArrayList<>();
            for (int i = 1; i <= n; ++i){
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < i; ++j){
                    temp.append('6');
                }
                for (int j = 1; j <= (int)Math.pow(2, i); ++j){
                    a.add(temp.toString());
                    temp = nextt(temp);
                }
            }
            Collections.reverse(a);
            System.out.println(a.size());
            for (String i : a){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}