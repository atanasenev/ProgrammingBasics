import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p10_SumNums_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        do {
            sum = sum + (n % 10);
            n = n / 10;
        } while (n != 0);
        System.out.println(sum);
    }
}
