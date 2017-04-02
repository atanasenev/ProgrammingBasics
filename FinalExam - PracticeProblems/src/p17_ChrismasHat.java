import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p17_ChrismasHat {
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

        //Top rows
        String topRowDots = magic(".", (2 * n) - 1);
        System.out.println(topRowDots + "/|\\" + topRowDots);
        System.out.println(topRowDots + "\\|/" + topRowDots);

        //Main Body
        for (int i = 0; i < 2 * n; i++) {
            String star = "*";
            String midRowDots = magic(".", (2 * n) - 1 - i);
            String midRowDashes = magic("-", i);

            System.out.println(midRowDots + star + midRowDashes + star + midRowDashes + star + midRowDots);
        }

        //Bottom Row
        String bottomRowStars = magic("*", (4*n +1));
        String bottomElement = magic(".*", 2 * n);
        System.out.println(bottomRowStars);
        System.out.println("*" + bottomElement);
        System.out.println(bottomRowStars);

    }
}
