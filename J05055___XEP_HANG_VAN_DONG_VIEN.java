import java.util.*;

class Athlete{
    String code, name, realtime, pritime, ranktime;
    int rank = 0;

    Athlete(String Code, String Name, String RealTime, String PriTime, String RankTime){
        this.code = Code;
        this.name = Name;
        this.realtime = RealTime;
        this.pritime = PriTime;
        this.ranktime = RankTime;
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.realtime + " " + this.pritime + " " + this.ranktime + " " + 
            String.valueOf(this.rank);
    }
}

public class J05055___XEP_HANG_VAN_DONG_VIEN{
    public static String format_time(int n){
        int h = n / 3600, m = (n - h * 3600) / 60, s = n - h * 3600 - m * 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public static int cnt_pri(String s){
        String[] a = s.split("/");
        int temp = 2021 - Integer.parseInt(a[2]);
        if (temp < 18){
            return 0;
        } else if (temp < 25){
            return 1;
        } else if (temp < 32){
            return 2; 
        }
        return 3;
    }

    public static int cnt_sec(String s){
        String[] a = s.split(":");
        return Integer.parseInt(a[0]) * 3600 + Integer.parseInt(a[1]) * 60 + Integer.parseInt(a[2]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Athlete> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String Name = sc.nextLine().trim(), Birth = sc.nextLine().trim(), Start = sc.nextLine().trim(), End = sc.nextLine().trim();
            String Code = String.format("VDV%02d", i), RealTime = format_time(cnt_sec(End) - cnt_sec(Start)), 
                PriTime = format_time(cnt_pri(Birth)), RankTime = format_time(cnt_sec(RealTime) - cnt_sec(PriTime));
            a.add(new Athlete(Code, Name, RealTime, PriTime, RankTime));
        }
        ArrayList <Athlete> b = new ArrayList<>(a);
        Collections.sort(b, new Comparator <Athlete>(){
            public int compare(Athlete x, Athlete y){
                return Integer.compare(cnt_sec(x.ranktime), cnt_sec(y.ranktime));
            }
        });
        b.get(0).rank = 1;
        for (int i = 1; i < a.size(); ++i){
            if (b.get(i).ranktime.equals(b.get(i - 1).ranktime)){
                b.get(i).rank = b.get(i - 1).rank;
            } else {
                b.get(i).rank = i + 1;
            }
        }
        for (Athlete i : a){
            System.out.println(i);
        }
        sc.close();
    }
}