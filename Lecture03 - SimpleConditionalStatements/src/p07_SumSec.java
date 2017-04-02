import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p07_SumSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = Integer.parseInt(scanner.nextLine());
        int r2 = Integer.parseInt(scanner.nextLine());
        int r3 = Integer.parseInt(scanner.nextLine());

        int sum = r1 + r2 + r3;

        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":" + "0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }

    }
}
