import java.util.*;

class Clothes{
    String code, name;
    long price1, price2;

    Clothes(String Code, String Name, long Price1, long Price2){
        this.code = Code;
        this.name = Name;
        this.price1 = Price1;
        this.price2 = Price2;
    }

    public long getPrice(Character c){
        return c == '1' ? this.price1 : this.price2;
    }
}

class Receipt{
    String code, name;
    long discount, price;

    Receipt(String Code, int ID, String Name, long Discount, long Price){
        this.code = Code + "-" + String.format("%03d", ID);
        this.name = Name;
        this.discount = Discount;
        this.price = Price;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.valueOf(this.discount) + " " + String.valueOf(this.price);
    }
}

public class J06001___TINH_TOAN_HOA_DON_BAN_QUAN_AO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap <String, Clothes> a = new HashMap<>();
        while (n-- > 0){
            sc.nextLine();
            String Code = sc.nextLine(), Name = sc.nextLine();
            long Price1 = sc.nextLong(), Price2 = sc.nextLong();
            a.put(Code, new Clothes(Code, Name, Price1, Price2));
        }
        int m = sc.nextInt();
        ArrayList <Receipt> b = new ArrayList<>();
        for (int i = 1; i <= m; ++i){
            sc.nextLine();
            String Code = sc.next();
            int cnt = sc.nextInt();
            Clothes x = a.get(Code.substring(0, Code.length() - 1));
            long Price = cnt * x.getPrice(Code.charAt(Code.length() - 1));
            long Discount = 0;
            if (cnt >= 150){
                Discount = Price * 50 / 100;
            } else if (cnt >= 100){
                Discount = Price * 30 / 100;
            } else if (cnt >= 50){
                Discount = Price * 15 / 100;
            }
            b.add(new Receipt(Code, i, x.name, Discount, Price - Discount));
        }
        for (Receipt i : b){
            System.out.println(i);
        }
        sc.close();
    }
}