import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p03_EvOdd {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int x = Integer.parseInt(a.nextLine());

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
