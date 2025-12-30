import java.util.*;
import java.io.*;

class Customer1{
    String code, name;
    int in, out, vat, total;

    Customer1(int ID, String Name, int In, int Out, int VAT, int Total){
        this.code = String.format("KH%02d", ID);
        this.name = Name;
        this.in = In;
        this.out = Out;
        this.vat = VAT;
        this.total = Total;
    }

    public int getTotal(){
        return this.total;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.valueOf(this.in) + " " + String.valueOf(this.out) + " " + 
            String.valueOf(this.vat) + " " + String.valueOf(this.total);
    } 
}

public class J07056___TINH_TIEN_DIEN{
    public static int cnt_in(String s, int x){
        if (s.equals("A")){
            if (x < 100){
                return x * 450;
            }
            return 100 * 450;
        } else if (s.equals("B")){
            if (x < 500){
                return x * 450;
            }
            return 500 * 450;
        }
        if (x < 200){
            return x * 450;
        }
        return 200 * 450;
    }

    public static int cnt_out(String s, int x){
        if (s.equals("A") && x > 100){
            return (x - 100) * 1000;
        } else if (s.equals("B") && x > 500){
            return (x - 500) * 1000;
        } else if (s.equals("C") && x > 200){
            return (x - 200) * 1000;
        }
        return 0;
    }

    public static double cnt_vat(int x){
        return 0.05 * x;
    }

    public static String correct_name(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList <Customer1> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            sc.nextLine();
            String Name = sc.nextLine().trim(), x = sc.next();
            int start = sc.nextInt(), end = sc.nextInt();
            int temp = end - start;
            int In = cnt_in(x, temp), Out = cnt_out(x, temp), VAT = (int)cnt_vat(Out), Total = In + Out + VAT;
            a.add(new Customer1(i, correct_name(Name), In, Out, VAT, Total));
        }
        Collections.sort(a, new Comparator <Customer1> (){
            public int compare(Customer1 x, Customer1 y){
                return Integer.compare(y.getTotal(), x.getTotal());
            }
        });
        for (Customer1 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}