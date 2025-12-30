import java.util.*;

public class J08025___QUAY_HINH_VUONG{
    public static String rotate1(String a){
        int[] b = {0, 1, 8, 1, 2, 1, 6, 1, 10, 1, 4};
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 11; ++i){
            temp.append(a.charAt(b[i]));
        } 
        return temp.toString();
    }

    public static String rotate2(String a){
        int[] b = {6, 1, 0, 1, 4, 1, 8, 1, 2, 1, 10};
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 11; ++i){
            temp.append(a.charAt(b[i]));
        }
        return temp.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.nextLine().trim(), b = sc.nextLine().trim();
            HashMap <String, Integer> c = new HashMap<>();
            c.put(a, 0);
            LinkedList <String> d = new LinkedList<>();
            d.add(a);
            while (!c.containsKey(b)){
                String temp = d.poll();
                String x = rotate1(temp), y = rotate2(temp);
                if (!c.containsKey(x)){
                    d.add(x);
                    c.put(x, c.get(temp) + 1);
                }
                if (!c.containsKey(b)){
                    d.add(y);
                    c.put(y, c.get(temp) + 1);
                }
            } 
            System.out.println(c.get(b));
        }
        sc.close();
    }
}