import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p14_Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numerOfBoughtChrysanthemums = Double.parseDouble(scan.nextLine());
        double numberOfBoughRoses = Double.parseDouble(scan.nextLine());
        double numberOfBoughtTulips = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String isItAHollyday = scan.nextLine();

        double chrysanthemumPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;
        //Number of flowers bought
        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumPrice = numerOfBoughtChrysanthemums * 2.00;
            rosePrice = numberOfBoughRoses * 4.10;
            tulipPrice = numberOfBoughtTulips * 2.50;
        } else {
            chrysanthemumPrice = numerOfBoughtChrysanthemums * 3.75;
            rosePrice = numberOfBoughRoses * 4.50;
            tulipPrice = numberOfBoughtTulips * 4.15;
        }
        //Pricing
        double subtotalForFlowers = chrysanthemumPrice + rosePrice + tulipPrice;
        if (isItAHollyday.equals("Y")) {
            subtotalForFlowers = subtotalForFlowers + (subtotalForFlowers * 0.15);
        }
        //Discount
        if (season.equals("Spring") && numberOfBoughtTulips > 7) {
            subtotalForFlowers = subtotalForFlowers - (subtotalForFlowers * 0.05);
        }
        if (season.equals("Winter") && numberOfBoughRoses >= 10) {
            subtotalForFlowers = subtotalForFlowers - (subtotalForFlowers * 0.10);
        }
        if (numberOfBoughRoses + numberOfBoughtTulips + numerOfBoughtChrysanthemums > 20) {
            subtotalForFlowers = subtotalForFlowers - (subtotalForFlowers * 0.20);
        }
        System.out.printf("%.2f", (subtotalForFlowers +2));
    }
}
