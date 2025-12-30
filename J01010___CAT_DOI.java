import java.util.Scanner;

public class J01010___CAT_DOI{
    public static String check(String s){
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) != '0'){
                return s;
            }
        }
        return "INVALID";
    }

    public static String res(String s){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if (c == '0' || c == '1'){
                temp.append(c);
            } else if (c == '8' || c == '9'){
                temp.append('0');
            } else {
                return "INVALID";
            }
        }
        return check(temp.toString());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            if (res(s).equals("INVALID")){
                System.out.println("INVALID");
            } else {
                System.out.println(Long.parseLong(res(s)));
            }
        }
        sc.close();
    }
}