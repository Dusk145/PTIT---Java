import java.util.*;
import java.io.*;

class Name implements Comparable <Name>{
    String name, code;

    Name(String X, String Code){
        this.name = X;
        this.code = Code;
    }

    public int compareTo(Name x){
        String[] a = this.name.split("\\s+"), b = x.name.split("\\s+");
        if (a[a.length - 1].equals(b[b.length - 1])){
            return a[0].compareTo(b[0]);
        }
        return a[a.length - 1].compareTo(b[b.length - 1]);
    }
}

public class J07071___TEN_VIET_TAT{
    public static String correct(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (String i : a){
            res.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Name> a = new ArrayList<>();
        while (n-- > 0){
            String s = correct(sc.nextLine().trim());
            String[] b = s.split("\\s+");
            StringBuilder temp = new StringBuilder();
            for (String i : b){
                temp.append(i.charAt(0) + ".");
            }
            a.add(new Name(s, temp.toString()));
        }
        Collections.sort(a);
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0){
            String s = sc.nextLine();
            for (Name i : a){
                if (i.code.length() - 1 != s.length()){
                    continue;
                }
                boolean ok = true;
                for (int j = 0; j < s.length(); j += 2){
                    if (s.charAt(j) == '*'){
                        continue;
                    }
                    if (s.charAt(j) != i.code.charAt(j)){
                        ok = false;
                        break;
                    }
                }
                if (ok){
                    System.out.println(i.name);
                }
            }
        }
        sc.close();
    }
}