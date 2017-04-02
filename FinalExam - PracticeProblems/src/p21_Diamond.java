import java.util.Scanner;

/**
 * Created by Atanas on 05/03/2017.
 */
public class p21_Diamond {
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

        //Upper part
        for (int i = 0; i < n; i++) {
            String upperDots = magic(".", n - i);
            String star = "*";
            String upperMidStars = magic("*", (3 * n) - 2);
            String upperMidDots = magic(".", (3 * n) - 2 + (2 * i));
            if (i == 0) {
                System.out.println(upperDots + star + upperMidStars + star + upperDots);
            } else {
                System.out.println(upperDots + star + upperMidDots + star + upperDots);
            }
        }

        //Mid part
        System.out.println(magic("*", 5 * n));

        //Lower part
        for (int i = 0; i < (2 * n) + 1; i++) {
            String lowerDots = magic(".", 1 + i);
            String star = "*";
            String lowerMidDots = magic(".", (5 * n) - 4 - (2 * i));
            String lowerMidStars = magic("*", (5 * n) - 4 - (2 * i));
            if (i == 2 * n) {
                System.out.println(lowerDots + star + lowerMidStars + star + lowerDots);
            } else {
                System.out.println(lowerDots + star + lowerMidDots + star + lowerDots);
            }
        }
    }
}
