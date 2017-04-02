import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p06_Romboid {
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
            System.out.print(repeatString(" ", n - i) + repeatString("* ", i).trim());
            System.out.println();
        }
        for (int j = n - 1 ; j >= 1; j--) {
            System.out.print(repeatString(" ", n - j) + repeatString("* ", j).trim());
            System.out.println();
        }
    }
}
