import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p05_NumWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if (a >= 0 && a <= 9) {
            if (a == 0) {
                System.out.print("zero");
            } else if (a == 1) {
                System.out.print("one");
            } else if (a == 2) {
                System.out.print("two");
            } else if (a == 3) {
                System.out.print("three");
            } else if (a == 4) {
                System.out.print("four");
            } else if (a == 5) {
                System.out.print("five");
            } else if (a == 6) {
                System.out.print("six");
            } else if (a == 7) {
                System.out.print("seven");
            } else if (a == 8) {
                System.out.print("eight");
            } else if (a == 9) {
                System.out.print("nine");
            }

        } else {
            System.out.print("number too big");
        }
    }
}
