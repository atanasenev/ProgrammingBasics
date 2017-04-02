import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p12_Butterfly {
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


        // Wings - Top

        for (int i = 1; i <= n - 2; i++) {
            if (i % 2 != 0) {
                String stars = magic("*", n - 2);
                String mid = magic("\\ /", 1);
                System.out.println(stars + mid + stars);
            } else if (i % 2 == 0){
                String dash = magic("-", n - 2);
                String mid = magic("\\ /", 1);
                System.out.println(dash + mid + dash);
            }

        }

        // Body

        System.out.println(magic(" ", n -1) + "@");

        // Wings - Bottom

        for (int i = 1; i <= n - 2; i++) {
            if (i % 2 != 0) {
                String stars = magic("*", n - 2);
                String mid = magic("/ \\", 1);
                System.out.println(stars + mid + stars);
            } else if (i % 2 == 0){
                String dash = magic("-", n - 2);
                String mid = magic("/ \\", 1);
                System.out.println(dash + mid + dash);
            }

        }
    }
}
