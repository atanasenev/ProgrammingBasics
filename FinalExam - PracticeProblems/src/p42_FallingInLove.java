import java.util.Scanner;

/**
 * Created by Atanas on 12/03/2017.
 */
public class p42_FallingInLove {
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
            String hash = "#";
            String tildas = magic("~", i);
            String dotsTop = magic(".", 2 * n - 2 * i);
            String dotsTopMid = magic(".", 2 * i);

            System.out.println(hash + tildas + hash + dotsTop + hash + dotsTopMid + hash + dotsTop + hash + tildas + hash);
        }

        //Mid
        for (int i = 0; i <= n; i++) {
            String dotsMid = magic(".", 1 + 2 * i);
            String hash = "#";
            String tildas = magic("~", n - i);
            String dotsMidMid = magic(".", 2 * n - 2 * i);

            System.out.println(dotsMid + hash + tildas + hash + dotsMidMid + hash + tildas + hash + dotsMid);
        }

        //Bottom
        for (int i = 0; i < n; i++) {
            String dotsBottom = magic(".", 2 * n + 2);
            String hash = "#";

            System.out.println(dotsBottom + hash + hash + dotsBottom);

        }
    }
}
