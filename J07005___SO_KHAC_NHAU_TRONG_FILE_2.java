import java.io.*;

public class J07005___SO_KHAC_NHAU_TRONG_FILE_2{
    public static void main(String[] args) throws IOException{
        DataInputStream r = new DataInputStream(new BufferedInputStream(new FileInputStream("DATA.IN")));
        int[] a = new int[1000];
        for (int i = 0; i < 100000; i++){
            int temp = r.readInt();
            a[temp]++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0) {
                res.append(i).append(" ").append(a[i]).append("\n");
            }
        }
        System.out.print(res.toString());
        r.close();
    }
}