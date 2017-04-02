import java.util.Scanner;

/**
 * Created by Atanas on 08/02/2017.
 */
public class test_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int a;
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < n; i++) {

            a = Integer.parseInt(scan.nextLine()) + Integer.parseInt(scan.nextLine());
            if (max < a) {
                max = a;
            }
            if (min > a){
                min = a;
            }
            sum += a;
        }

        System.out.printf("Number of sums is %d. Sum of input is %d\nThe biggest sum is %d. The smallest sum is %d.", n, sum, max, min);
    }
}
