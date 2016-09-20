package Week3;

import java.util.Scanner;
/**
 * Created by karim on 15-Sep-16.
 */
public class Exercise4 {

    public void run(){
        Scanner sc = new Scanner (System.in);

        int age = sc.nextInt();

            if(age < 18) {
                System.out.println("You are not allowed to buy alcohol");
            }
            else {
                 System.out.println("You are allowed to buy alcohol");
            }
    }

    public static void main(String[] args) {
        new Exercise4().run();

    }
    }

