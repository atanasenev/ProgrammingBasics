import java.util.Scanner;

/**
 * Created by Atanas on 05/03/2017.
 */
public class p20_MatchingTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tripBudget = Double.parseDouble(scan.nextLine());
        String ticketType = scan.nextLine();
        double numberOfPeople = Double.parseDouble(scan.nextLine());
        double budgetAfterTransportFee = 0;
        double ticketPrice = 0;

        if (numberOfPeople <= 4) {
            budgetAfterTransportFee = tripBudget - (tripBudget * 0.75);
        } else if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            budgetAfterTransportFee = tripBudget - (tripBudget * 0.60);
        } else if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            budgetAfterTransportFee = tripBudget - (tripBudget * 0.50);
        } else if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            budgetAfterTransportFee = tripBudget - (tripBudget * 0.40);
        } else {
            budgetAfterTransportFee = tripBudget - (tripBudget * 0.25);
        }

        if (ticketType.equals("VIP")) {
            ticketPrice = 499.99;
        } else {
            ticketPrice = 249.99;
        }

        double moneyLeft = budgetAfterTransportFee - (ticketPrice * numberOfPeople);

        if (moneyLeft > 0) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(moneyLeft));
        }

    }
}
