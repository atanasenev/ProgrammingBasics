import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Atanas on 23/02/2017.
 */
public class p01_HungryGarfield {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double money =          Double.parseDouble(scan.nextLine());
        double exchangeRate =   Double.parseDouble(scan.nextLine());
        double pizzaPrice =     Double.parseDouble(scan.nextLine());
        double lazzagniaPrice = Double.parseDouble(scan.nextLine());
        double sandwitchPrice = Double.parseDouble(scan.nextLine());
        double pizzaQuantity =  Double.parseDouble(scan.nextLine());
        double lazzagniaQuamtity = Double.parseDouble(scan.nextLine());
        double sandwitchQuantity = Double.parseDouble(scan.nextLine());

        double moneyNeeded = (pizzaPrice / exchangeRate * pizzaQuantity) + (lazzagniaPrice / exchangeRate * lazzagniaQuamtity)
                + (sandwitchPrice / exchangeRate * sandwitchQuantity);

        double moneyLeft = money - moneyNeeded;

        BigDecimal outputPositive = new BigDecimal(Math.abs(moneyLeft));

        if (moneyLeft < 0) {
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%.2f.", outputPositive);
        } else {
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%.2f.", outputPositive);
        }


    }
}
