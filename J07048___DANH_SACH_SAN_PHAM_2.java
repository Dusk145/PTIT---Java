import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Product{
    String id, name;
    int sell, guarantee;

    Product(String ID, String Name, int Sell, int Guarantee){
        this.id = ID;
        this.name = Name;
        this.sell = Sell;
        this.guarantee = Guarantee;
    }

    public String toString(){
        return this.id + " " + this.name + " " + String.valueOf(this.sell) + " " + String.valueOf(this.guarantee);
    }

    public String getID(){
        return this.id;
    }

    public int getSell(){
        return this.sell;
    }
}

public class J07048___DANH_SACH_SAN_PHAM_2{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("SANPHAM.in"));
            int n = sc.nextInt();
            List <Product> a = new ArrayList<>();
            while (n-- > 0){
                sc.nextLine();
                String ID = sc.nextLine(), Name = sc.nextLine();
                int Sell = sc.nextInt(), Guarantee = sc.nextInt();
                a.add(new Product(ID, Name, Sell, Guarantee));
            }
            Collections.sort(a, new Comparator <Product>(){
                public int compare(Product x, Product y){
                    if (x.getSell() == y.getSell()) {
                        return x.getID().compareTo(y.getID());
                    }
                    return Integer.compare(y.getSell(), x.getSell());
                }
            });
            for (Product i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}