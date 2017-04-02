import java.util.Scanner;

/**
 * Created by Nasko on 3.1.2017 г..
 */
public class test12 {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        double a = Double.parseDouble(z.nextLine());
        String Cin = z.nextLine();
        String Cout = z.nextLine();

        double bgn2usd = a / 1.79549;

        if (Cin.equals("BGN") && Cout.equals("USD")) {
            System.out.printf("%.2f", bgn2usd);
        }
    }
}