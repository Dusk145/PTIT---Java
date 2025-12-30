import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Customer{
    String code, name, room;
    int day, total;

    Customer(int ID, String Name, String Room, int Day, int Total){
        this.code = String.format("KH%02d", ID);
        this.name = Name;
        this.room = Room;
        this.day = Day;
        this.total = Total;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.valueOf(this.room) + " " + String.valueOf(this.day) + " " + String.valueOf(this.total);
    }

    public int getTotal(){
        return this.total;
    }
}

public class J07051___TINH_TIEN_PHONG{
    public static String correct_name(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public static String correct_date(String s){
        StringBuilder res = new StringBuilder(s);
        if (res.charAt(1) == '/'){
            res.insert(0, "0");
        }
        if (res.charAt(4) == '/'){
            res.insert(3, "0");
        }
        return res.toString();
    }

    public static int price(String s){
        if (s.charAt(0) == '1'){
            return 25;
        } else if (s.charAt(0) == '2'){
            return 34;
        } else if (s.charAt(0) == '3'){
            return 50;
        }
        return 80;
    }

    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = sc.nextInt();
            List <Customer> a = new ArrayList<>();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (int i = 1; i <= n; ++i){
                sc.nextLine();
                String Name = sc.nextLine().trim(), Room = sc.nextLine().trim();
                String Arrive = sc.nextLine().trim(), Leave = sc.nextLine().trim();
                int Extra = sc.nextInt();
                LocalDate start = LocalDate.parse(correct_date(Arrive), fmt), end = LocalDate.parse(correct_date(Leave), fmt);
                int Day = (int) ChronoUnit.DAYS.between(start, end);
                int Total = price(Room) * (Day + 1) + Extra;
                a.add(new Customer(i, correct_name(Name), Room, Day + 1, Total));
            }
            Collections.sort(a, new Comparator <Customer> (){
                public int compare(Customer x, Customer y){
                    return Integer.compare(y.getTotal(), x.getTotal());
                }
            });
            for (Customer i : a){
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e){}
    }
}