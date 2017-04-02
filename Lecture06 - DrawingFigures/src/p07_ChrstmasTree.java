import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p07_ChrstmasTree {
    static String Magic(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n + 1; i++) {
            String spaces = Magic(" ", (n - i) + 1);
            String stars = Magic("*", i - 1);
            String stem = " | ";
            System.out.println(spaces + stars + stem + stars + spaces);
        }
    }
}
