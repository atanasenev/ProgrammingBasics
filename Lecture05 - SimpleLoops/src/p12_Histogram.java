import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p12_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double p1Sum = 0.00;
        double p2Sum = 0.00;
        double p3Sum = 0.00;
        double p4Sum = 0.00;
        double p5Sum = 0.00;

        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(scan.nextLine());
            if (a < 200) {
                p1Sum += 1;
            } else if (a >= 200 && a <= 399) {
                p2Sum += 1;
            } else if (a >= 400 && a <= 599) {
                p3Sum += 1;
            } else if (a >= 600 && a <= 799) {
                p4Sum += 1;
            } else if (a >= 800) {
                p5Sum += 1;
            }
        }

        double p1 = (p1Sum / n) * 100.00;
        double p2 = (p2Sum / n) * 100.00;
        double p3 = (p3Sum / n) * 100.00;
        double p4 = (p4Sum / n) * 100.00;
        double p5 = (p5Sum / n) * 100.00;


        System.out.println(new DecimalFormat("0.00").format(p1));
        System.out.printf("%.2f\n", p1);
        System.out.printf("%.2f\n", p2);
        System.out.printf("%.2f\n", p3);
        System.out.printf("%.2f\n", p4);
        System.out.printf("%.2f", p5);
    }
}
