import java.util.*;

class Receipt2 implements Comparable <Receipt2>{
    String code, cus, stuff_name;
    int cnt, total, profit;

    Receipt2(String Code, String Cus, String Stuff_name, int Cnt, int Total, int Profit){
        this.code = Code;
        this.cus = Cus;
        this.stuff_name = Stuff_name;
        this.cnt = Cnt;
        this.total = Total;
        this.profit = Profit; 
    }

    public int compareTo(Receipt2 x){
        return Integer.compare(x.profit, this.profit);
    }

    public String toString(){
        return this.code + " " + this.cus + " " + this.stuff_name + " " + String.valueOf(this.cnt) + " "
            + String.valueOf(this.total) + " " + String.valueOf(this.profit);
            
    }
}

public class J06006___QUAN_LY_BAN_HANG_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap <String, String> a = new HashMap<>();
        for (int i = 1; i <= n; ++i){
            String Code = String.format("KH%03d", i), Name = sc.nextLine().trim(), Gender = sc.nextLine().trim();
            String Birth = sc.nextLine().trim(), Address = sc.nextLine().trim();
            a.put(Code, Name + " " + Address);
        }
        int m = sc.nextInt();
        sc.nextLine();
        HashMap <String, String> b = new HashMap<>();
        for (int i = 1; i <= m; ++i){
            String Code = String.format("MH%03d", i), Name = sc.nextLine().trim(), Unit = sc.nextLine().trim(), 
                Buy = sc.nextLine().trim(), Sell = sc.nextLine().trim();
            b.put(Code, Name + " " + Buy + " " + Sell);
        }
        int k = sc.nextInt();
        ArrayList <Receipt2> c = new ArrayList<>();
        for (int i = 1; i <= k; ++i){
            String Code = String.format("HD%03d", i), Cus_code = sc.next(), Stuff_code = sc.next();
            int Cnt = sc.nextInt();
            String[] temp = b.get(Stuff_code).split("\\s+");
            StringBuilder Stuff_name = new StringBuilder();
            for (int j = 0; j < temp.length - 2; ++j){
                Stuff_name.append(temp[j] + " ");
            }
            int Total = Cnt * Integer.valueOf(temp[temp.length - 1]);
            int Profit = Cnt * (Integer.valueOf(temp[temp.length - 1]) - Integer.valueOf(temp[temp.length - 2]));
            c.add(new Receipt2(Code, a.get(Cus_code), Stuff_name.toString().trim(), Cnt, Total, Profit));
        }
        Collections.sort(c);
        for (Receipt2 i : c){
            System.out.println(i);
        }
        sc.close();
    }
}