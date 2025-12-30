import java.util.*;

public class J03029___CHUAN_HOA_CAU{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = new String[200];
        int idx = 0;
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.isEmpty()){
                break;
            }
            a[idx] = s.trim().toLowerCase();
            ++idx;
        }
        for (int i = 0; i < idx; ++i){
            String[] b = a[i].split("\\s+");
            StringBuilder res = new StringBuilder();
            res.append(Character.toUpperCase(b[0].charAt(0)) + b[0].substring(1) + " ");
            for (int j = 1; j < b.length - 1; ++j){
                res.append(b[j] + " ");
            }
            if (b[b.length - 1].equals(".") || b[b.length - 1].equals("!") || b[b.length - 1].equals("?")){
                res.deleteCharAt(res.length() - 1);
                res.append(b[b.length - 1]);
            } else {
                res.append(b[b.length - 1]);
                int temp = res.length() - 1;
                if (res.charAt(temp) != '.' && res.charAt(temp) != '!' && res.charAt(temp) != '?'){
                    res.append(".");
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}