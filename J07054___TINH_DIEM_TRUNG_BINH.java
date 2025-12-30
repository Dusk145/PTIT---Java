import java.util.*;
import java.io.*;

class Score{
    String code, name;
    double mark;

    Score(int ID, String Name, double Mark){
        this.code = String.format("SV%02d", ID);
        this.name = Name;
        this.mark = Mark;
    }

    public String toString(){
        return this.code + " " + this.name + " " + String.format("%.2f", this.mark);
    }

    public double getMark(){
        return this.mark;
    }

    public String getCode(){
        return this.code;
    }
}

public class J07054___TINH_DIEM_TRUNG_BINH{
    public static String correct_name(String s){
        StringBuilder res = new StringBuilder();
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; ++i){
            res.append(String.valueOf(Character.toUpperCase(a[i].charAt(0))) + a[i].substring(1) + " ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        ArrayList <Score> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            String Name = sc.nextLine().trim();
            int Mark1 = sc.nextInt(), Mark2 = sc.nextInt(), Mark3 = sc.nextInt();
            double Mark = (Mark1 * 3 + Mark2 * 3 + Mark3 * 2) / 8.0;
            a.add(new Score(i, correct_name(Name), Mark));
        }
        Collections.sort(a, new Comparator <Score> (){
            public int compare(Score x, Score y){
                if (x.getMark() == y.getMark()){
                    return x.getCode().compareTo(y.getCode());
                }
                return Double.compare(y.getMark(), x.getMark());
            }
        });
        double temp = 0.0;
        int cnt = 1, idx = 0;
        for (int i = 0; i < a.size(); ++i){
            Score x = a.get(i);
            if (x.getMark() != temp){
                temp = x.getMark();
                cnt += idx;
                idx = 0;
            }            
            System.out.println(x + " " + String.valueOf(cnt));
            ++idx;
        }
        sc.close();
    }
}