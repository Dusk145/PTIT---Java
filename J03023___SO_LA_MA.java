import java.util.*;

public class J03023___SO_LA_MA{
    public static int change(char a){
        if (a == 'I'){
            return 1;
        } else if (a == 'V'){
            return 5;
        } else if (a == 'X'){
            return 10;
        } else if (a == 'L'){
            return 50;
        } else if (a == 'C'){
            return 100;
        } else if (a == 'D'){
            return 500;
        } 
        return 1000;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.next();
            long S = change(a.charAt(a.length() - 1));
            for (int i = a.length() - 2; i >= 0; --i){
                int x = change(a.charAt(i)), y = change(a.charAt(i + 1));
                if (x >= y){
                    S += x;
                } else if (x < y){
                    S -= x;
                }
            }
            System.out.println(S);
        }
        sc.close();
    }
}