import java.util.*;

public class J08026___BIEN_DOI_S_T{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt(), y = sc.nextInt();
            if (x >= y){
                System.out.println(x - y);
                continue;
            }
            HashMap <Integer, Integer> a = new HashMap<>();
            LinkedList <Integer> b = new LinkedList<>();
            a.put(x, 0);
            b.add(x);
            while (!b.isEmpty()){
                int temp = b.poll();
                int u = temp - 1, v = temp * 2;
                if (u == y || v == y){
                    System.out.println(a.get(temp) + 1);
                    break;
                }
                if (u <= 2 * y && !a.containsKey(u)){
                    a.put(u, a.get(temp) + 1);
                    b.add(u);
                }
                if (v <= 2 * y && !a.containsKey(v)){
                    a.put(v, a.get(temp) + 1);
                    b.add(v);
                }
            }
        }
        sc.close();
    }
}