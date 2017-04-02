import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p14_NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int number = 1;
        int i = 1;

        do {
            for (int j = 1; j <= i; j++) {
                System.out.print((number + " "));
                number++;
                count++;
            }
            System.out.println("".trim());
            i++;
        } while (count != n);
    }
}
