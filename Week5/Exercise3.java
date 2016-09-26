package Week5;

import java.util.Arrays;

/**
 * Created by karim on 26-Sep-16.
 */
public class Exercise3 {
    public void run() {

        int[] values;
        values = new int[5];

        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;
        values[4] = 5;

        int temp = values[0];

        values[0] = values [values.length - 1];

        values [values.length - 1] = temp;

        System.out.println(Arrays.toString(values));
        }


    public static void main(String[] args) {

        new Exercise3().run();
    }
    }


