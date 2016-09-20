package Week3;

import java.util.Scanner;
/**
 * Created by karim on 16-Sep-16.
 */
public class Exercise6 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int outcome1 = number1 + number2;
        int outcome2 = number1 - number2;
        int outcome3 = number2 - number1;
        int outcome4 = number2 * number1;
        int outcome5 = number1 / number2;
        int outcome6 = number2 / number1;
        int outcome7 = number1 % number2;
        int outcome8 = number2 % number1;

        System.out.println(outcome1);
        System.out.println(outcome2);
        System.out.println(outcome3);
        System.out.println(outcome4);
        System.out.println(outcome5);
        System.out.println(outcome6);
        System.out.println(outcome7);
        System.out.println(outcome8);



    }

    public static void main(String[] args) {
        new Exercise6().run();
    }
}
