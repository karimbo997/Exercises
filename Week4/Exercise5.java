package Week4;
import java.util.Scanner;
/**
 * Created by Karim on 20-Sep-16.
 */
public class Exercise5 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");

        int width = scanner.nextInt();
        String hash = "#";
        for (int x=0; x < width; x++ ){

            System.out.println(hash);
            hash = hash + "#";
        }






    }

    public static void main(String[] args) {
        new Exercise5().run();
    }
}
