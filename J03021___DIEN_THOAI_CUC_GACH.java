import java.util.*;

public class J03021___DIEN_THOAI_CUC_GACH{
    public static String change(char c){
        if (c >= 'a' && c <= 'z'){
            c -= 32;
        }
        if (c >= 'A' && c <= 'C'){
            return "2";
        } else if (c >= 'D' && c <= 'F'){
            return "3";
        } else if (c >= 'G' && c <= 'I'){
            return "4";
        } else if (c >= 'J' && c <= 'L'){
            return "5";
        } else if (c >= 'M' && c <= 'O'){
            return "6";
        } else if (c >= 'P' && c <= 'S'){
            return "7";
        } else if (c >= 'T' && c <= 'V'){
            return "8";
        } else {
            return "9";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            String temp = "";
            for (int i = 0; i < s.length(); ++i){
                temp += change(s.charAt(i));
            }
            StringBuilder rever = new StringBuilder(temp); 
            if (temp.equals(rever.reverse().toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}