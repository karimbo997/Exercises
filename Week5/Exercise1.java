package Week5;

/**
 * Created by karim on 26-Sep-16.
 */
public class Exercise1 {
    public void run(){

        int [] values;
        values = new int[5];
        values[0] = 2;
        values[1] = 4;
        values[2] = 6;
        values[3] = 8;
        values[4] = 10;

        for(int i = 0; i < values.length; i++ ){

            System.out.println(values[i]);

        }
    }

    public static void main(String[] args) {
        new Exercise1().run();
    }
}
