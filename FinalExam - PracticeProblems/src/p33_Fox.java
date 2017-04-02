import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p33_Fox {
    static String magic(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        //Top
        for (int i = 0; i < input; i++) {
            String star = magic("*", i + 1);
            String dashes = magic("-", (2 * input) - 1 - (2 * i));

            System.out.println(star + "\\" + dashes + "/" + star);
        }

        //Mid
        for (int i = 0; i < input / 3; i++) {
            String stars = magic("*", input / 2 + i);
            String midStars = magic("*", input - 2 * i);

            System.out.println("|" + stars + "\\" + midStars + "/" + stars + "|");
        }

        //Bottom
        for (int i = 0; i < input; i++) {
            String dashes = magic("-", i + 1);
            String stars = magic("*", (2 * input) - 1 - (2 * i));

            System.out.println(dashes + "\\" + stars + "/" + dashes);

        }
    }
}
