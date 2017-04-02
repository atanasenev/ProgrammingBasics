import java.util.Scanner;

/**
 * Created by Atanas on 01/03/2017.
 */
public class p10_Stop {
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

        //Upper body
        for (int i = 0; i < n; i++) {
            String dots = magic(".", n - i);
            String dash = magic("_", (2 * n - 1) + 2 * i);
            if (i == 0) {
                System.out.println(dots + "._" + dash + "_." + dots);
            }
            System.out.println(dots + "//" + dash + "\\\\" + dots);
        }

        //Mid
        String midDash = magic("_", 2 * n - 3);
        System.out.println("//" + midDash + "STOP!" + midDash + "\\\\");

        //Lower body
        for (int i = n; i > 0; i--) {
            String dots = magic(".", n - i);
            String dash = magic("_", (2 * n - 1) + 2 * i);
            System.out.println(dots + "\\\\" + dash + "//" + dots);
        }

    }

}

