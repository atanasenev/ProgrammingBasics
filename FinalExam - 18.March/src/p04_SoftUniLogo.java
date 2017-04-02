import java.util.Scanner;

/**
 * Created by Atanas on 18/03/2017.
 */
public class p55_SoftUniLogo {
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
        for (int i = 0; i < 2 * n; i++) {
            String dots = magic(".", (6 * n) - 3 - 3 * i);
            String hases = magic("#", i * 3);

            System.out.println(dots + hases + "#" + hases + dots);

        }

        //Mid
        for (int i = 0; i <= n - 2; i++) {
            String dotsMidLeft = magic(".", 3 + 3 * i - 1);
            String dotsMidRight = magic(".", 3 + 3 * i);
            String hasesMid = magic("#", 6 * n - 6 - 3 * i);

            System.out.println("|" + dotsMidLeft + hasesMid + "#" + hasesMid + dotsMidRight);
        }

        //Bottom
        for (int i = 0; i < n - 1; i++) {
            String dotsBottomLeft = magic(".", 3 * n - 4);
            String dotsBottomRight = magic(".", 3 * n - 3);
            String hashesBottom = magic("#", 3 * n);

            if (i == n - 2) {
                System.out.println("@" + dotsBottomLeft + hashesBottom + "#" + hashesBottom + dotsBottomRight);
            } else{
                System.out.println("|" + dotsBottomLeft + hashesBottom + "#" + hashesBottom + dotsBottomRight);

            }
        }


    }
}
