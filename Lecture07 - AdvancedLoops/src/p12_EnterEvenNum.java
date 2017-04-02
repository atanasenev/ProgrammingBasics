import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p12_EnterEvenNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Enter an even number: ");
                n = Integer.parseInt(scan.nextLine());
                if (n % 2 == 0) {
                    break;
                } else{
                    System.out.println("The number is not even.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }
        System.out.println("Even number entered: " + n);
    }

}


