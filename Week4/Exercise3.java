package Week4;

import java.util.Scanner;
/**
 * Created by Karim on 20-Sep-16.
 */
public class Exercise3 {
    public void run(){

        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();

        double DiscountPrice;

        if (price < 100){
            DiscountPrice = price * 0.95;
        }
        else if (price >= 100 && price < 200){
            DiscountPrice = price * 0.9;
        }
        else {
            DiscountPrice = price * 0.8;
            System.out.println("Your discount price = " + DiscountPrice);
        }


        System.out.println("Discount Price" + DiscountPrice);




    }

    public static void main(String[] args) {
        new Exercise3().run();
    }
}
