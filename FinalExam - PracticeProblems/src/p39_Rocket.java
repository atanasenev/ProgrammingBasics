import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p39_Rocket {
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
            String dots = magic(".", (3 * n - 2) / 2 - i);
            String spaces = magic(" ", i * 2);

            System.out.println(dots + "/" + spaces + "\\" + dots);
        }

        //Mid
        String dots = magic(".", n / 2);
        String starsMid = magic("*", 2 * n);
        String backslash = magic("\\", 2 * n - 2);
        System.out.println(dots + starsMid + dots);

        for (int i = 0; i < 2 * n; i++) {
            System.out.println(dots + "|" + backslash + "|" + dots);
        }

        //Bottom
        for (int i = 0; i < n / 2; i++) {
            String dotsBottom = magic(".", n / 2 - i);
            String starsBottom = magic("*", 2 * n - 2 + 2 * i);

            System.out.println(dotsBottom + "/" + starsBottom + "\\" + dotsBottom);
        }
    }
}
