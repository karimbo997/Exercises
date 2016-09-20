package Week3;

/**
 * Created by karim on 19-Sep-16.
 */
public class Exercise8 {
    public void run(){

        double n = 17;
        double m = 18;

        System.out.print("A. ");
        double outcome1 = n / 10 * n % 20;
        System.out.println(outcome1);

        System.out.print("B. ");
        double outcome2 = n % 2 + m % 20;
        System.out.println(outcome2);

        System.out.print("C. ");
        double outcome3 = (m + n) / 2;
        System.out.println(outcome3);

        System.out.print("D. ");
        double outcome4 = (m + n) / 2.0;
        System.out.println(outcome4);

        System.out.print("E. ");
        double outcome5 = (int) (0.5 * (m + n));
        System.out.println(outcome5);

    }

    public static void main(String[] args) {
        new Exercise8().run();
    }
}
