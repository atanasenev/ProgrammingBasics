import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p05_EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i +=2 ) {
            System.out.println(num);
            num = num * 4;

        }
    }
}
