import java.util.*;

public class J04015___TINH_THU_NHAP_GIAO_VIEN{
    public static long cnt(String a){
        if (a.equals("HT")){
            return 2000000;
        } else if (a.equals("HP")){
            return 900000;
        }
        return 500000;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Code = sc.nextLine(), Name = sc.nextLine();
        long Salary = sc.nextLong();
        long temp = Integer.valueOf(Code.substring(2));
        System.out.printf("%s %s %d %d %d", Code, Name, temp, cnt(Code.substring(0, 2)), Salary * temp + cnt(Code.substring(0, 2)));
        sc.close();
    }
}