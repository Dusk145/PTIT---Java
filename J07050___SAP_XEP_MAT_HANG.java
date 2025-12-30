import java.util.*;
import java.io.*;

class Stuff1 implements Comparable <Stuff1>{
    String code, name, group;
    double buy, sell;

    Stuff1(int ID, String Name, String Group, double Buy, double Sell){
        this.code = String.format("MH%02d", ID);
        this.name = Name;
        this.group = Group;
        this.buy = Buy;
        this.sell = Sell;
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.group + " " + String.format("%.2f", this.sell - this.buy);
    }

    public int compareTo(Stuff1 x){
        return Double.compare(x.sell - x.buy, this.sell - this.buy);
    }
}

public class J07050___SAP_XEP_MAT_HANG{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        ArrayList <Stuff1> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            sc.nextLine();
            String Name = sc.nextLine().trim(), Group = sc.nextLine().trim();
            double Buy = sc.nextDouble(), Sell = sc.nextDouble();
            a.add(new Stuff1(i, Name, Group, Buy, Sell));
        }
        Collections.sort(a);
        for (Stuff1 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}