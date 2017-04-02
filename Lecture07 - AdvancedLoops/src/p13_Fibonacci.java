import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p13_Fibonacci {
    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // First Numbers
        int f00 = 1;
        int f01 = 1;

        // Finding Fibonacci
        if (n < 2) {
            System.out.println("1");
        } else {
            for (int i = 0; i < n / 2; i++) {
               // With each cycle f00 -> f02/or the third F number / -> f04... -> fp if p is an even
                f00 = f00 + f01;
                // With each cycle f01 -> f03 -> f05... -> f(p-1) if p is an odd number
                f01 = f01 + f00;
            }
        }

        // Cases for System Output
        if (n % 2 == 0){
            System.out.println(f00);
        } else {
            System.out.println(f01);
        }
    }
}
