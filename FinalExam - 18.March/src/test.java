import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String startingLetter = scan.nextLine();
        String endLetter = scan.nextLine();
        String omitLetter = scan.next();
        int counter = 0;

        for (char i = startingLetter.charAt(0); i <= endLetter.charAt(0); i++) {
            for (char j = startingLetter.charAt(0); j <= endLetter.charAt(0); j++) {
                for (char k = startingLetter.charAt(0); k <= endLetter.charAt(0); k++) {
                    if (i == omitLetter.charAt(0) || j == omitLetter.charAt(0) || k == omitLetter.charAt(0)) {
                        continue;
                    } else {
                        counter++;
                        System.out.print("" + i + j + k + " ");
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
