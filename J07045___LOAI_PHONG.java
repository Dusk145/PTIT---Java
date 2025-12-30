import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable <LoaiPhong>{
    String code, name, price, fee;

    LoaiPhong(String s){
        String[] temp = s.trim().split("\\s+");
        this.code = temp[0];
        this.name = temp[1];
        this.price = temp[2];
        this.fee = temp[3];
    }

    public int compareTo(LoaiPhong x){
        return this.name.compareTo(x.name);
    }

    public String toString(){
        return this.code + " " + this.name + " " + this.price + " " + this.fee;
    }
}

public class J07045___LOAI_PHONG{
    public static void main(String[] args) throws Exception{
        ArrayList <LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}