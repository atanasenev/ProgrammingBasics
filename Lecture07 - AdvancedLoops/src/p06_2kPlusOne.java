import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p06_2kPlusOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i = 2 * i + 1) {
            System.out.println(i);
        }
    }
}
