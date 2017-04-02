import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p37_BikeRace {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numberOfJuniors = Double.parseDouble(scan.nextLine());
        double numberOfSeniors = Double.parseDouble(scan.nextLine());
        String trailType = scan.nextLine();

        double juniorEntryFee = 0;
        double seniorEntryFee = 0;

        if (trailType.equals("trail")) {
            juniorEntryFee = 5.50;
            seniorEntryFee = 7.00;
        } else if (trailType.equals("cross-country")) {
            if (numberOfJuniors + numberOfSeniors >= 50) {
                juniorEntryFee = 8.00 - 8.00 * 0.25;
                seniorEntryFee = 9.50 - 9.50 * 0.25;
            } else {
                juniorEntryFee = 8.00;
                seniorEntryFee = 9.50;
            }
        } else if (trailType.equals("downhill")) {
            juniorEntryFee = 12.25;
            seniorEntryFee = 13.75;
        } else if (trailType.equals("road")) {
            juniorEntryFee = 20.00;
            seniorEntryFee = 21.50;
        }

        double revenue = juniorEntryFee * numberOfJuniors + seniorEntryFee * numberOfSeniors;
        double expences = revenue * 0.05;
        double moneyForDonation = revenue - expences;

        System.out.printf("%.2f",moneyForDonation);
    }
}
