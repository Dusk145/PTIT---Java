import java.util.*;

public class J02007___DEM_SO_LAN_XUAT_HIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while (t-- > 0){
            int n = sc.nextInt();
            LinkedHashMap <Integer, Integer> a = new LinkedHashMap<>();
            for (int i = 0; i < n; ++i){
                int temp = sc.nextInt();
                a.put(temp, a.getOrDefault(temp, 0) + 1);
            }
            System.out.printf("Test %d:\n", cnt);
            for (int i : a.keySet()){
                System.out.printf("%d xuat hien %d lan\n", i, a.get(i));
            }
            ++cnt;
        }
        sc.close();
    }
}