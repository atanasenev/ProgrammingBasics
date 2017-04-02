import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p09_Factoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int i = 1; i <= n ; i++) {
            num = num * i;
        }
        System.out.println(num);
    }
}
