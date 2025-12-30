import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE___HELLO_FILE{
    public static void main(String[] args){
        try{
            Scanner read = new Scanner(new File("Hello.txt"));
            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e){
        }
    }
}