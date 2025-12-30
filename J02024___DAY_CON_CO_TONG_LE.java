import java.util.*;

public class J02024___DAY_CON_CO_TONG_LE{
    static ArrayList <Integer> a;

    public static void res(int end, int S, String s){
        if (S % 2 != 0){
            System.out.println(s);
        }
        for (int i = a.size() - 1; i > end; --i){
            res(i, S + a.get(i), s + " " + String.valueOf(a.get(i)));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            a = new ArrayList<>();
            for (int i = 0; i < n; ++i){
                a.add(sc.nextInt());
            }
            Collections.sort(a, Collections.reverseOrder());
            res(-1, 0, "");
        }
        sc.close();
    }
}