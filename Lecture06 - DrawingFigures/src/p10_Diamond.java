import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p10_Diamond {
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
        int oddStar = 1;
        int evenStar = 2;


        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("**");
        } else if (n % 2 != 0) {
            //Upper point
            for (int i = 0; i < 1; i++) {
                String space = magic("-", n / 2 - i);
                String star = magic("*", oddStar);
                System.out.println(space + star + space);
            }

            //Upper body
            for (int i = 1; i <= n / 2; i++) {
                String space = magic("-", n / 2 - i);
                String star = "*";
                String spaceIn = magic("-", oddStar + 2 * i - 2);
                System.out.println(space + star + spaceIn + star + space);

            }

            //Lower body
            for (int i = n / 2 - 1; i >= 1; i--) {
                String space = magic("-", n / 2 - i);
                String star = "*";
                String spaceIn = magic("-", oddStar + 2 * i - 2);
                System.out.println(space + star + spaceIn + star + space);
            }

            //Bottom point
            for (int i = 0; i < 1; i++) {
                String space = magic("-", n / 2 - i);
                String star = magic("*", oddStar);
                System.out.println(space + star + space);
            }

        } else if (n % 2 == 0) {
            //Upper point
            for (int i = 0; i < 1; i++) {
                String space = magic("-", n / 2 - i - 1);
                String star = magic("*", evenStar);
                System.out.println(space + star + space);
            }

            //Upper body
            for (int i = 1; i <= n / 2 - 1; i++) {
                String space = magic("-", n / 2 - i - 1);
                String star = "*";
                String spaceIn = magic("-", oddStar + 2 * i - 1);

                System.out.println(space + star + spaceIn + star + space);
            }

            //Lower body
            for (int i = n / 2 - 2; i >= 1; i--) {
                String space = magic("-", n / 2 - i - 1);
                String star = "*";
                String spaceIn = magic("-", oddStar + 2 * i - 1);

                System.out.println(space + star + spaceIn + star + space);
            }

            //Lower point
            for (int i = 0; i < 1; i++) {
                String space = magic("-", n / 2 - i - 1);
                String star = magic("*", evenStar);
                System.out.println(space + star + space);
            }
        }
    }
}
