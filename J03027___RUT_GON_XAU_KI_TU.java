import java.util.*;

public class J03027___RUT_GON_XAU_KI_TU{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack <Character> b = new Stack<>();
        for (int i = 0; i < a.length(); ++i){
            if (b.empty()){
                b.push(a.charAt(i));
            } else {
                if (a.charAt(i) == b.lastElement()){
                    b.pop();
                } else {
                    b.push(a.charAt(i));
                }
            }
        }
        if (b.empty()){
            System.out.println("Empty String");
        } else {
            StringBuilder res = new StringBuilder();
            while (!b.empty()){
                res.append(b.lastElement());
                b.pop();
            }
            System.out.println(res.reverse().toString());
        }
        sc.close();
    }
}