import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p10_TypAn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();

        switch (a) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            default:
                System.out.println("Unknown");


        }
    }
}
