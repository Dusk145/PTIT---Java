import java.util.*;

class Stuff{
    String code, name, unit;
    long buy, sell, profit;

    Stuff(int ID, String Name, String Unit, long Buy, long Sell){
        this.code = String.format("MH%03d", ID);
        this.name = Name;
        this.unit = Unit;
        this.buy = Buy;
        this.sell = Sell;
        this.profit = Sell - Buy;
    }

    public String toString(){
        return code + " " + name + " " + unit + " " + buy + " " + sell + " " + profit;
    }
}

public class J05081___DANH_SACH_MAT_HANG{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Stuff> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            sc.nextLine();
            String Name = sc.nextLine(), Unit = sc.nextLine();
            long Buy = sc.nextLong(), Sell = sc.nextLong();
            a.add(new Stuff(i, Name, Unit, Buy, Sell));
        }
        Collections.sort(a, (x, y) -> {
            if (y.profit != x.profit){
                return Long.compare(y.profit, x.profit);
            }
            return x.code.compareTo(y.code);
        });
        for (Stuff i : a){
            System.out.println(i);
        }
        sc.close();
    }
}