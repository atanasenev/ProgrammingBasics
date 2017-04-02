import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p09_ElSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int b = Integer.MIN_VALUE;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            sum += a;
            if (b < a) {
                b = a;
            }
        }

        if (sum - b == b){
            System.out.println("Yes Sum = " + (sum - b));
        } else{
            System.out.println("No Diff = " + Math.abs((sum - b) - b));
        }
    }
}
