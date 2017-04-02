import java.util.Scanner;

/**
 * Created by Atanas on 13/03/2017.
 */
public class p46_IlluminatiClock {
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
        String singleHash = "#";
        String doubleHash = "##";

        //Top
        for (int i = 0; i < (n + 1) / 2; i++) {
            String dotsTopOut = magic(".", n - 2 * i);
            String innerTopDotsAndHashes = "#" + magic(".", n - 2) + "#";
            String innerTopHashes = "#" + magic("#", n - 2) + "#";
            String midTopDots = magic(".", 2 * i - 2);

            if (i == 0) {
                System.out.println(dotsTopOut + midTopDots + innerTopHashes + midTopDots + dotsTopOut);
            } else {
                System.out.println(dotsTopOut + doubleHash + midTopDots + innerTopDotsAndHashes + midTopDots + doubleHash + dotsTopOut);
            }
        }

        //Bottom
        for (int i = (n + 1) / 2 - 1; i >= 0; i--) {
            String dotsTopOut = magic(".", n - 2 * i);
            String innerTopDotsAndHashes = "#" + magic(".", n - 2) + "#";
            String innerTopHashes = "#" + magic("#", n - 2) + "#";
            String midTopDots = magic(".", 2 * i - 2);

            if (i == 0) {
                System.out.println(dotsTopOut + midTopDots + innerTopHashes + midTopDots + dotsTopOut);
            } else {
                System.out.println(dotsTopOut + doubleHash + midTopDots + innerTopDotsAndHashes + midTopDots + doubleHash + dotsTopOut);
            }
        }
    }
}
