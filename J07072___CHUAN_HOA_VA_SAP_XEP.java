import java.util.*;
import java.io.*;

public class J07072___CHUAN_HOA_VA_SAP_XEP{
    public static String correct_name(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <String> a = new ArrayList<>();
        while (sc.hasNextLine()){
            String s = sc.nextLine().trim();
            a.add(correct_name(s));
        }
        Collections.sort(a, new Comparator <String> (){
            public int compare(String x, String y){
                String[] u = x.split("\\s+"), v = y.split("\\s+");
                if (u[u.length - 1].equals(v[v.length - 1])){
                    if (u[0].equals(v[0])){
                        StringBuilder z = new StringBuilder(), t = new StringBuilder();
                        for (int i = 1; i < u.length - 1; ++i){
                            z.append(u[i] + " ");
                        }
                        for (int i = 1; i < v.length - 1; ++i){
                            t.append(v[i] + " ");
                        }
                        return z.toString().compareTo(t.toString());
                    }
                    return u[0].compareTo(v[0]);
                }
                return u[u.length - 1].compareTo(v[v.length - 1]);
            }
        });
        for (String i : a){
            System.out.println(i);
        }
        sc.close();
    }
}