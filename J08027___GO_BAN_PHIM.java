import java.util.*;

public class J08027___GO_BAN_PHIM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack <Character> a = new Stack<>(), b = new Stack<>();
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '>'){
                if (!b.isEmpty()){
                    a.push(b.pop());
                }
            } else if (s.charAt(i) == '<'){
                if (!a.isEmpty()){
                    b.push(a.pop());
                }
            } else if (s.charAt(i) == '-'){
                if (!a.isEmpty()){
                    a.pop();
                }
            } else {
                a.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!a.isEmpty()){
            res.append(a.pop());
        }
        res = res.reverse();
        while (!b.isEmpty()){
            res.append(b.pop());
        }
        System.out.println(res.toString());
        sc.close();
    }
}