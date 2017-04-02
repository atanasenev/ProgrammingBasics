import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Atanas on 18/03/2017.
 */
public class p52_CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        while (budget < 10 || budget > 10000) {
            budget = Double.parseDouble(scan.nextLine());
        }
        String season = scan.nextLine();
        while (!season.equals("Summer") && !season.equals("Winter")) {
            season = scan.nextLine();
        }
        String carClass = "";
        String carType = "";
        double carPrice = 0;


        if (budget >= 10 && budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 35 / 100;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * 65 / 100;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 45 / 100;
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                carPrice = budget * 80 / 100;
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 90 / 100;
        }


        System.out.printf("%s\n%s - %.2f", carClass, carType, carPrice);

    }
}
