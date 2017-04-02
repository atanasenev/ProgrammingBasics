import java.util.Scanner;

/**
 * Created by Atanas on 05/03/2017.
 */
public class p22_StopNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int endNumber = Integer.parseInt(scan.nextLine());
        int startNumber = Integer.parseInt(scan.nextLine());
        int stopNumber = Integer.parseInt(scan.nextLine());

        for (int i = startNumber; i >= endNumber; i--) {
            if (i == stopNumber && stopNumber % 2 == 0 && stopNumber % 3 == 0) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print((i + " "));
            }
        }
    }
}
