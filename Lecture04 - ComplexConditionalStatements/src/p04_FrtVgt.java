import java.util.Scanner;

/**
 * Created by Atanas on 23/01/2017.
 */
public class p04_FrtVgt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        if (input.equals("banana") || input.equals("apple") || input.equals("kiwi") ||
                input.equals("cherry") || input.equals("lemon") || input.equals("grapes")){
            System.out.println("fruit");
        } else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper") ||
                input.equals("carrot")){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
