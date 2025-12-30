import java.util.*;

public class JKT015___GO_BAN_PHIM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Stack <Character> b = new Stack<>(), c = new Stack<>();
        for (int i = 0; i < a.length(); ++i){
            if (a.charAt(i) == '<'){
                if (!b.empty()){
                    c.push(b.pop());
                }
            } else if (a.charAt(i) == '>'){
                if (!c.empty()){
                    b.push(c.pop());
                }
            } else if (a.charAt(i) == '-'){
                if (!b.empty()){
                    b.pop();
                }
            } else {
                b.push(a.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!b.empty()){
            res.append(b.pop());
        }
        res = res.reverse();
        while (!c.empty()){
            res.append(c.pop());
        }
        System.out.println(res.toString());
        sc.close();
    }
}