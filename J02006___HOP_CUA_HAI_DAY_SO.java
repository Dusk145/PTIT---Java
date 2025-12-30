import java.util.*;

public class J02006___HOP_CUA_HAI_DAY_SO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet <Integer> a = new TreeSet<>();
        for (int i = 0; i < n; ++i){
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; ++i){
            a.add(sc.nextInt());
        }
        for (int i : a){
            System.out.printf("%d ", i);
        }
        sc.close();
    }
}