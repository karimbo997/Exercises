package Week3;

import java.util.Scanner;
/**
 * Created by karim on 19-Sep-16.
 */
public class Exercise7 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meters");
        double height = sc.nextDouble();
        height = height * height;
        System.out.println("Enter your weight in KG");
        double weight = sc.nextDouble();

        double outcome = weight / height;
        System.out.println(outcome);

        if (outcome < 18.5){
            System.out.println("Underweight");
        }
        else if (outcome >=18.5 && outcome < 25) {
            System.out.println("Normal Weight");
        }
        else if (outcome >= 25 && outcome < 30) {
            System.out.println("Overweight");
        }
        else if (outcome >= 30){
            System.out.println("Obesity");
        }

    }


    public static void main(String[] args) {
        new Exercise7().run();
    }
}
