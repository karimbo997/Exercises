package Week5;

/**
 * Created by karim on 26-Sep-16.
 */
public class Exercise5 {
    public void run() {

        double[] values;
        values = new double[5];

        values[0] = 4.75;
        values[1] = 6.90;
        values[2] = 8.40;
        values[3] = 9.50;
        values[4] = 3.20;

        double sum = 0;

        for (int i = 0; i < values.length; i++) {


            sum = sum + values[i];
        }
        System.out.println(sum / values.length);

    }


    public static void main(String[] args) {

        new Exercise5().run();
    }
    }


