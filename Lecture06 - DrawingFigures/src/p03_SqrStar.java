import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p03_SqrStar {
    public static String repeatString(String stringToRepeat, int count){
        String text = "";
        String space = " ";
        for (int i = 0; i < count; i++) {
            text = stringToRepeat + space + text;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(repeatString("*", n).trim());

        }
    }
}
