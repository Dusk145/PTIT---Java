import java.util.*;

public class J03038___DANH_DAU_CHU_CAI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet <Character> a = new HashSet<>();
        for (int i = 0; i < s.length(); ++i){
            a.add(s.charAt(i));
        }
        System.out.println(a.size());
        sc.close();
    }
}