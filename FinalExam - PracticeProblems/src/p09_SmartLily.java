import java.util.Scanner;

/**
 * Created by Atanas on 28/02/2017.
 */
public class p09_SmartLily {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washerPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double moneySavedEvenBdays = 0;
        double moneyGottenEvenBdays = 0;
        double moneySavedToys;
        int toysNumber = 0;
        double moneyStolen = 0;

        while (age != 0) {
            if (age % 2 == 0) {

                moneyGottenEvenBdays = 10 + moneyGottenEvenBdays;
                moneySavedEvenBdays += moneyGottenEvenBdays;
                moneyStolen += 1;

            } else if (age % 2 != 0) {
                toysNumber += 1;
            }
            age--;
        }
        moneySavedToys = toysNumber * toyPrice;
        double totalFunds = moneySavedToys + moneySavedEvenBdays - moneyStolen;

        if ((totalFunds - washerPrice) >= 0) {
            System.out.printf("Yes! %.2f", (totalFunds - washerPrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(washerPrice - totalFunds));

        }
    }
}
