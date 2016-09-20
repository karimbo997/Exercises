package Week4;
import java.util.Scanner;
/**
 * Created by Karim on 20-Sep-16.
 */
public class Exercise6 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of tosses?");
        int tosses = sc.nextInt();
        int rollcount = 0;



        for (int x = 0; 0 < tosses; x++){
            if (tosses > x){
                int roll = (int) (Math.random()*6)+1;
                System.out.println("Roll: " + roll);
                rollcount++;
            }
            else {
                break;
            }


        }






    }
    public static void main(String[] args) {
        new Exercise6().run();
    }

}
