import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p10_SumNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = n; n > 0; ) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println(sum);
    }
}
