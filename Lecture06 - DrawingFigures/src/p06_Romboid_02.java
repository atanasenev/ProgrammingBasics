import java.util.Scanner;

/**
 * Created by Atanas on 12/02/2017.
 */
public class p06_Romboid_02 {

    public static String repeatString(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + stringToRepeat;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            String spaces = repeatString(" ", n - i);
            String stars = repeatString("* ", i);
            System.out.println(spaces + stars.trim());

        }
        for (int i = n - 1; i >= 1; i--) {
            String spaces = repeatString(" ", n - i);
            String stars = repeatString("* ", i);
            System.out.println(spaces + stars);

        }

    }
}