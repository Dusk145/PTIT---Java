import java.util.*;

class Customer2{
    String code, name, gender, birth, address;

    Customer2(String Code, String Name, String Gender, String Birth, String Address){
        this.code = Code;
        this.name = Name;
        this.gender = Gender;
        this.birth = Birth;
        this.address = Address;
    }

    public String toString(){
        return this.name + " " + this.address + " ";
    }
}

class Stuff2{
    String code, name, unit;
    int buy, sell;

    Stuff2(String Code, String Name, String Unit, int Buy, int Sell){
        this.code = Code;
        this.name = Name;
        this.unit = Unit;
        this.buy = Buy;
        this.sell = Sell;
    }

    public String toString(){
        return this.name + " " + this.unit + " " + String.valueOf(this.buy) + " " + String.valueOf(this.sell) + " ";
    }
}

public class J06005___QUAN_LY_BAN_HANG_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap <String, Customer2> a = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; ++i){
            String Code = String.format("KH%03d", i), Name = sc.nextLine().trim(), Gender = sc.nextLine().trim();
            String Birth = sc.nextLine().trim(), Address = sc.nextLine().trim();
            a.put(Code, new Customer2(Code, Name, Gender, Birth, Address));
        }
        int m = sc.nextInt();
        HashMap <String, Stuff2> b = new HashMap<>();
        for (int i = 1; i <= m; ++i){
            sc.nextLine();
            String Code = String.format("MH%03d", i), Name = sc.nextLine().trim(), Unit = sc.nextLine().trim();
            int Buy = sc.nextInt(), Sell = sc.nextInt();
            b.put(Code, new Stuff2(Code, Name, Unit, Buy, Sell));
        }
        int k = sc.nextInt();
        for (int i = 1; i <= k; ++i){
            String Code = String.format("HD%03d", i), Cus_code = sc.next(), Stuff_code = sc.next();
            int Cnt = sc.nextInt();
            Customer2 x = a.get(Cus_code);
            Stuff2 y = b.get(Stuff_code);
            System.out.println(Code + " " + x + y + String.valueOf(Cnt) + " " + String.valueOf(Cnt * y.sell));
        }
        sc.close();
    }
}