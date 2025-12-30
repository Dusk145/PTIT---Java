import java.util.*;

public class J04007___KHAI_BAO_LOP_NHAN_VIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine(), Gender = sc.nextLine(), Birth = sc.nextLine();
        String Address = sc.nextLine(), Code = sc.nextLine(), Date = sc.nextLine();
        System.out.printf("00001 %s %s %s %s %s %s", Name, Gender, Birth, Address, Code, Date);
        sc.close();
    }
}