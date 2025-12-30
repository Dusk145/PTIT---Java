import java.util.*;

public class J02106___MA_TRAN_NHI_PHAN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i){
            int cnt = 0;
            for (int j = 0; j < 3; ++j){
                int temp = sc.nextInt();
                if (temp == 1){
                    ++cnt;
                }
            }
            if (cnt > 1){
                ++res;
            }
        }
        System.out.println(res);
        sc.close();
    }
}