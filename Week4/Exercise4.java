package Week4;

import java.util.Scanner;
/**
 * Created by Karim on 20-Sep-16.
 */
public class Exercise4 {
    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a valid postal code");

        boolean check = true;

        while (check) {
            int pc = sc.nextInt();
            if (pc < 1000 || pc > 9999){
               System.out.println("Invalid postal code");
           }
           else {
               System.out.println("Valid postal code");
               check = false;
            }
        }
    }


    public static void main(String[] args) {
        new Exercise4().run();
    }
}
