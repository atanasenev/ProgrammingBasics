import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p05_InVld {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());


        if (a != 0 && a < 100 || a > 200) {
            System.out.println("invalid");
        }
    }
}
