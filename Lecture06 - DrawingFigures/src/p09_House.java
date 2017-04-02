import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p09_House {
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

        //Roof
        if (n == 2) {
            System.out.println("**");
        } else if (n % 2 != 0) {
            int oddStar = 1;
            //top
            for (int i = 0; i < 1; i++) {
                String space = magic(" ", n / 2 - i);
                String star = magic("*", oddStar);
                System.out.println(space + star + space);
            }

            //roof body
            for (int i = 1; i <= n / 2; i++) {
                String space = magic(" ", n / 2 - i);
                String stars = magic("*", oddStar + 2 * i);
                System.out.println(space + stars + space);

            }
        } else if (n % 2 == 0){
            int evenStar = 2;
            //top
            for (int i = 0; i < 1; i++) {
                String space = magic(" ", n / 2 - i - 1);
                String star = magic("*", evenStar);
                System.out.println(space + star + space);
            }

            //roof body
            for (int i = 1; i <= n / 2 - 1; i++) {
                String space = magic(" ", n / 2 - i - 1);
                String stars = magic("*", evenStar + 2 * i);
                System.out.println(space + stars + space);

            }
        }

        //Body
        for (int i = 0; i < n / 2; i++) {
            String wall = "|";
            String interior = magic("*", n - 2);
            System.out.println(wall + interior + wall);
        }
    }
}
