package Week3;

import java.util.Scanner;
/**
 * Created by karim on 15-Sep-16.
 */
public class Exercise5 {

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check == true) {
            System.out.println("Please enter a number between 1 and 10");
            int number = sc.nextInt();
            String input = sc.nextLine();

            if (number == 1) {
                System.out.println("I");
            } else if (number == 2) {
                System.out.println("II");
            } else if (number == 3) {
                System.out.println("III");
            } else if (number == 4) {
                System.out.println("IV");
            } else if (number == 5) {
                System.out.println("V");
            } else if (number == 6) {
                System.out.println("VI");
            } else if (number == 7) {
                System.out.println("VII");
            } else if (number == 8) {
                System.out.println("VIII");
            } else if (number == 9) {
                System.out.println("IX");
            } else if (number == 10) {
                System.out.println("X");
            } else if (number > 10) {
                check = false;
            }
        }

        }



    public static void main(String[] args) {
        new Exercise5().run();
    }
}

