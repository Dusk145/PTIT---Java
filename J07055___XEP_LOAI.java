import java.util.*;
import java.io.*;

class Score1{
    String code, name, status;
    double mark;

    Score1(int ID, String Name, double Mark, String Status){
        this.code = String.format("SV%02d", ID);
        this.name = Name;
        this.mark = Mark;
        this.status = Status;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.format("%.2f", this.mark) + " " + this.status;
    }

    public double getMark(){
        return this.mark;
    }
}

public class J07055___XEP_LOAI{
    public static String correct_name(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static String check(double x){
        if (x >= 8){
            return "GIOI"; 
        } else if (x >= 6.5){
            return "KHA";
        } else if (x >= 5){
            return "TRUNG BINH";
        }
        return "KEM";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList <Score1> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            String Name = sc.nextLine().trim();
            int mark1 = sc.nextInt(), mark2 = sc.nextInt(), mark3 = sc.nextInt();
            double Mark = mark1 * 0.25 + mark2 * 0.35 + mark3 * 0.4;
            String Status = check(Mark);
            a.add(new Score1(i, correct_name(Name), Mark, Status));
        }
        Collections.sort(a, new Comparator <Score1> (){
            public int compare(Score1 x, Score1 y){
                return Double.compare(y.getMark(), x.getMark());
            }
        });
        for (Score1 i : a){
            System.out.println(i);
        }
        sc.close();
    }
}