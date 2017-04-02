import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p31_Vacantion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numberAdults = Double.parseDouble(scan.nextLine());
        double numberStudents = Double.parseDouble(scan.nextLine());
        double numberNightsSpent = Double.parseDouble(scan.nextLine());
        String transportType = scan.nextLine();

        double ticketPriceAdults = 0;
        double ticketPriceStudents = 0;

        if (transportType.equals("train")) {
            if (numberAdults + numberStudents > 50) {
                ticketPriceAdults = 24.99 * 0.50;
                ticketPriceStudents = 14.99 * 0.50;
            } else {
                ticketPriceAdults = 24.99;
                ticketPriceStudents = 14.99;
            }
        } else if (transportType.equals("bus")) {
            ticketPriceAdults = 32.50;
            ticketPriceStudents = 28.50;
        } else if (transportType.equals("boat")) {
            ticketPriceAdults = 42.99;
            ticketPriceStudents = 39.99;
        } else {
            ticketPriceAdults = 70.00;
            ticketPriceStudents = 50.00;
        }

        double totalTravelFee = 2*((ticketPriceAdults* numberAdults) + (ticketPriceStudents* numberStudents));
        double totalHotelFee = numberNightsSpent * 82.99;
        double comissionTravelAgents = (totalTravelFee + totalHotelFee)*0.10;

        double totalJourneyCost = totalHotelFee + totalTravelFee + comissionTravelAgents;

        System.out.printf("%.2f",totalJourneyCost);

    }
}
