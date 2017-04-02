import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class test_methods {
    static void sayMyName(String name) {
        System.out.println("Well, howdy " + name);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many are you");
        int names = Integer.parseInt(s.nextLine());

        for (int i = 0; i < names; i++) {
            System.out.print("What is your name? ");
            String name = s.nextLine();
            sayMyName(name);

        }

    }
}
