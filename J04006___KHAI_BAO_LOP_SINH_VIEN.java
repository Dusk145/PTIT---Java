import java.util.*;

public class J04006___KHAI_BAO_LOP_SINH_VIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine(), Class = sc.nextLine(), Birth = sc.nextLine();
        double GPA = sc.nextDouble();
        StringBuilder temp = new StringBuilder(Birth);
        if (temp.charAt(1) == '/'){
            temp.insert(0, '0');
        } 
        if (temp.charAt(4) == '/'){
            temp.insert(3, '0');
        }
        System.out.printf("B20DCCN001 %s %s %s %.2f", Name, Class, temp.toString(), GPA);
        sc.close();
    }
}