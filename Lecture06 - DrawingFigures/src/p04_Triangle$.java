import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p04_Triangle$ {
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

        for (int i = 0; i < n ; i++) {
            System.out.println(Magic("$ ",i+1).trim());

        }
    }
}
