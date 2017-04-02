import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p36_FlowerShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double magnoliaPrice = 3.25;
        double hiacynthPrice = 4.00;
        double rosePrice = 3.50;
        double cactusPrice = 8.00;

        double magnoliaNumber = Double.parseDouble(scan.nextLine());
        double hiacynthNumber = Double.parseDouble(scan.nextLine());
        double roseNumber = Double.parseDouble(scan.nextLine());
        double cactusNumber = Double.parseDouble(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double revenue = magnoliaPrice * magnoliaNumber + hiacynthPrice * hiacynthNumber +
                rosePrice * roseNumber + cactusPrice * cactusNumber;
        double tax = revenue * 0.05;
        double taxedIncome = revenue - tax;
        double moneyLeft = Math.abs(taxedIncome - giftPrice);
        BigDecimal moneyAfterTransaction = new BigDecimal(moneyLeft);

        if(taxedIncome >= giftPrice){
            System.out.printf("She is left with %.0f leva.",moneyAfterTransaction.setScale(0,BigDecimal.ROUND_DOWN));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", moneyAfterTransaction.setScale(0, BigDecimal.ROUND_UP));
        }

    }
}
