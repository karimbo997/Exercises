package Week5;

import java.util.Arrays;

/**
 * Created by karim on 26-Sep-16.
 */
public class Exercise4 {
    public void run() {

        int[] values;
        int max = 0;
        values = new int[5];

        values[0] = 4;
        values[1] = 2;
        values[2] = 6;
        values[3] = 5;
        values[4] = 1;



        for (int i = 0; i < values.length; i++) {
            if (values[i] > max){

                max = values[i];
            }



        }
        System.out.println(max);

    }




    public static void main(String[] args) {

        new Exercise4().run();
    }
    }


