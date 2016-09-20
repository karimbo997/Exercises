package Week3;

import java.util.Scanner;
/**
 * Created by karim on 12-Sep-16.
 */
public class Exercise3 {

    public void run(){
        Scanner sc = new Scanner (System.in);

        String name = sc.nextLine();

        System.out.println("Hello," + name);

    }
        public static void main (String[] args) {
            new Exercise3().run();
        }


}

