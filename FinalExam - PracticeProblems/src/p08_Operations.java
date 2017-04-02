import java.util.Scanner;

/**
 * Created by Atanas on 28/02/2017.
 */
public class p08_Operations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();

        if (operator.equals("+")) {
            double sum = n1 + n2;
            if (sum % 2 == 0) {
                System.out.printf("%f + %f = %f - even", n1, n2, sum);
            } else {
                System.out.printf("%f + %f = %f - odd", n1, n2, sum);
            }
        } else if (operator.equals("-")) {
            double sum = n1 - n2;
            if (sum % 2 == 0) {
                System.out.printf("%f - %f = %f - even", n1, n2, sum);
            } else {
                System.out.printf("%f - %f = %f - odd", n1, n2, sum);
            }
        } else if (operator.equals("*")) {
            double sum = n1 * n2;
            if (sum % 2 == 0) {
                System.out.printf("%f * %f = %f - even", n1, n2, sum);
            } else {
                System.out.printf("%f * %f = %f - odd", n1, n2, sum);
            }
        } else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double sum = n1 / n2;
                System.out.printf("%f / %f = %.2f", n1, n2, sum);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double sum = n1 % n2;
                System.out.printf("%f % %f = %.2f", n1, n2, sum);
            }
        }

    }
}
