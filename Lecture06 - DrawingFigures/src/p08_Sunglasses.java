import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p08_Sunglasses {
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
        System.out.println(repeatString("*", n * 2) + repeatString(" ", n) +
                repeatString("*", 2 * n));

        for (int i = 0; i < n - 2; i++) {
            if(i == (n-2)/2 && n % 2 != 0){
                System.out.println(repeatString("*", 1) + repeatString("/", 2 * n - 2) +
                        repeatString("*", 1) + repeatString("|", n) +
                        repeatString("*", 1) + repeatString("/", 2*n-2) +
                        repeatString("*", 1));

            } else if (i == (n-2)/2 - 1 && n % 2 == 0){
                System.out.println(repeatString("*", 1) + repeatString("/", 2 * n - 2) +
                        repeatString("*", 1) + repeatString("|", n) +
                        repeatString("*", 1) + repeatString("/", 2*n-2) +
                        repeatString("*", 1));

            } else {
                System.out.println(repeatString("*", 1) + repeatString("/", 2 * n - 2) +
                        repeatString("*", 1) + repeatString(" ", n) +
                        repeatString("*", 1) + repeatString("/", 2*n-2) +
                        repeatString("*", 1));
            }

        }

        System.out.println(repeatString("*", n * 2) + repeatString(" ", n) +
                repeatString("*", 2 * n));
    }
}
