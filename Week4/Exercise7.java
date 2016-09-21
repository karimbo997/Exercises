package Week4;
import java.util.Scanner;
/**
 * Created by Karim on 20-Sep-16.
 */
public class Exercise7 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount of tosses?");

        int tosses = sc.nextInt();

        for (int i = 1; i <= tosses; i++){

            int dice = (int) (Math.random() * 6) + 1;

            System.out.println("Ones: " + dice);

        }



    }

    public static void main(String[] args) {
        new Exercise7().run();
    }
}