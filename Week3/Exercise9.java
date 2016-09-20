package Week3;

import java.util.Scanner;
/**
 * Created by karim on 19-Sep-16.
 */
public class Exercise9 {
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the Amount Due (in cents)");
        int AmountDue = sc.nextInt();
        System.out.println("Please input the Amount Paid (in cents)");
        int AmountPaid = sc.nextInt();

        int outcome = AmountPaid - AmountDue;
        System.out.println(outcome);

        int FiveCents = 5;
        int FiveCentsCount = 0;
        int TenCents = 10;
        int TenCentsCount = 0;
        int TwentyCents = 20;
        int TwentyCentsCount = 0;
        int FiftyCents = 50;
        int FiftyCentsCount = 0;
        int OneEuro = 100;
        int OneEuroCount = 0;
        int TwoEuro = 200;
        int TwoEuroCount = 0;
        int FiveEuro = 500;
        int FiveEuroCount = 0;
        int TenEuro = 1000;
        int TenEuroCount = 0;
        int TwentyEuro = 2000;
        int TwentyEuroCount = 0;
        int FiftyEuro = 5000;
        int FiftyEuroCount = 0;


        while (outcome >= FiftyEuro){
            outcome = outcome - FiftyEuro;
            FiftyEuroCount++;
        }
        while (outcome >= TwentyEuro){
            outcome = outcome - TwentyEuro;
            TwentyEuroCount++;
        }
        while (outcome >= TenEuro){
            outcome = outcome - TenEuro;
            TenEuroCount++;
        }
        while (outcome >= FiveEuro){
            outcome = outcome - FiveEuro;
            FiveEuroCount++;
        }
        while (outcome >= TwoEuro){
            outcome = outcome - TwoEuro;
            TwoEuroCount++;
        }
        while (outcome >= OneEuro){
            outcome = outcome - OneEuro;
            OneEuroCount++;
        }
        while (outcome >= FiftyCents){
            outcome = outcome - FiftyCents;
            FiftyCentsCount++;
        }
        while (outcome >= TwentyCents){
            outcome = outcome - TwentyCents;
            TwentyCentsCount++;
        }
        while (outcome >= TenCents) {
            outcome = outcome - TenCents;
            TenCentsCount++;
        }
        while (outcome >= FiveCents) {
            outcome = outcome - FiveCents;
            FiveCentsCount++;
        }

        System.out.println("Fifty Euro count" + FiftyEuroCount);
        System.out.println("Twenty Euro count" + TwentyEuroCount);
        System.out.println("Ten Euro count" + TenEuroCount);
        System.out.println("Five Euro count" + FiveEuroCount);
        System.out.println("Two Euro count" + TwoEuroCount);
        System.out.println("One Euro count" + OneEuroCount);
        System.out.println("Fifty Cent count" + FiftyCentsCount);
        System.out.println("Twenty Cent count" + TwentyCentsCount);
        System.out.println("Ten Cents count" + TenCentsCount);
        System.out.println("Five Cents count" + FiveCentsCount);

        System.out.println("Outcome:");
        System.out.print(outcome);
    }

    public static void main(String[] args) {
        new Exercise9().run();
    }
}
