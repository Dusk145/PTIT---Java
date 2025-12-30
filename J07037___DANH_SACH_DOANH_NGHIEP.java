import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Company{
    String code, name;
    int amount;

    Company(String Code, String Name, int Amount){
        this.code = Code;
        this.name = Name;
        this.amount = Amount;
    }

    public String toString(){
        return code + " " + name + " " + String.valueOf(amount);
    }

    public String getCode(){
        return this.code;
    }
}

public class J07037___DANH_SACH_DOANH_NGHIEP{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = sc.nextInt();
            List <Company> a = new ArrayList<>();
            while (n-- > 0){
                sc.nextLine();
                String Code = sc.nextLine(), Name = sc.nextLine();
                int Amount = sc.nextInt();
                a.add(new Company(Code, Name, Amount));
            }
            Collections.sort(a, new Comparator <Company> (){
                @Override
                public int compare(Company x, Company y){
                    return x.getCode().compareTo(y.getCode());
                }
            });
            for (Company i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}