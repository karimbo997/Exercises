package Week5;

/**
 * Created by karim on 26-Sep-16.
 */
public class Exercise2 {
    public void run(){

        int[] values;
        values = new int[6];

        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;
        values[4] = 5;
        values[5] = 6;

        for (int i = values.length - 1; i >= 0; i--){
            System.out.println(values[i]);

        }
    }

    public static void main(String[] args) {
        new Exercise2().run();
    }
    }


