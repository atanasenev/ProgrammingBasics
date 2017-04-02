import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p13_DevR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double p1Sum = 0;
        double p2Sum = 0;
        double p3Sum = 0;


        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            if (a % 4 == 0) {
                p3Sum += 1;
            }
            if (a % 3 == 0) {
                p2Sum += 1;
            }
            if (a % 2 == 0) {
                p1Sum += 1;
            }

        }
        double p1 = p1Sum / n * 100;
        double p2 = p2Sum / n * 100;
        double p3 = p3Sum / n * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%", p3);

    }
}
