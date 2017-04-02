import java.util.Scanner;

/**
 * Created by Atanas on 07/03/2017.
 */
public class p27_Axe {
    static String magic(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //Top
        for (int i = 0; i < n; i++) {
            String leftDashes = magic("-", 3 * n);
            String star = "*";
            String midDashes = magic("-", i);
            String rightDashes = magic("-", (2 * n) - i - 2);

            System.out.println(leftDashes + star + midDashes + star + rightDashes);
        }

        //Mid
        for (int i = 0; i < n / 2; i++) {
            String starHandle = magic("*", 3 * n);
            String star = "*";
            String midDashes = magic("-", n - 1);
            String rightDashes = magic("-", n - 1);

            System.out.println(starHandle + star + midDashes + star + rightDashes);
        }

        //Bottom
        for (int i = 0; i < n / 2; i++) {
            String leftDashes = magic("-", (3 * n) - i);
            String star = "*";
            String midDashes = magic("-", n - 1 + (2 * i));
            String rightDashes = magic("-", n - 1 - i);

            if (i == (n / 2) - 1){
                midDashes = magic("*", n - 1 + (2 * i));
            }

                System.out.println(leftDashes + star + midDashes + star + rightDashes);
        }
    }
}
