import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Atanas on 29/01/2017.
 */
public class p15_Hldy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#######.##");

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination;
        double spent;

        if (season.equals("summer")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                spent = 0.30 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Camp - " + format.format(spent));
            } else if (budget > 100 && budget <= 1000) {
                destination = "Balkans";
                spent = 0.40 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Camp - " + format.format(spent));
            } else {
                destination = "Europe";
                spent = 0.90 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Hotel - " + format.format(spent));
            }

        } else if (season.equals("winter")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                spent = 0.70 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Hotel - " + format.format(spent));
            } else if (budget > 100 && budget <= 1000) {
                destination = "Balkans";
                spent = 0.80 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Hotel - " + format.format(spent));
            } else {
                destination = "Europe";
                spent = 0.90 * budget;
                System.out.println("Somewhere in " + destination);
                System.out.println("Hotel - " + format.format(spent));
            }

        }
    }
}
