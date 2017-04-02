import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p07_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = -10000;

        for (int i = n; i <= 0 || i > 100; ) {
            System.out.print("Enter a number in the range [1...100]: ");
            n = Integer.parseInt(scan.nextLine());
            if (n <= 0 || n > 100){
                System.out.println("Invalid number!");
            } else  {
                System.out.println("The number is: " + n);
                break;
            }
        }
    }
}
