import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Atanas on 08/03/2017.
 */
public class p30_Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numberOfDaysAway = Double.parseDouble(scan.nextLine());
        double availableFoodInKg = Double.parseDouble(scan.nextLine());
        double dogFoodNeededPerDay = Double.parseDouble(scan.nextLine());
        double catFoodNeededPerDay = Double.parseDouble(scan.nextLine());
        double turtleFoodNeededPerDay = Double.parseDouble(scan.nextLine()) / 1000;

        double consumedFood = (dogFoodNeededPerDay * numberOfDaysAway) + (catFoodNeededPerDay * numberOfDaysAway) +
                (turtleFoodNeededPerDay * numberOfDaysAway);
        double foodLeft = Math.abs(availableFoodInKg - consumedFood);
        BigDecimal food = new BigDecimal(foodLeft);

        if (availableFoodInKg >= consumedFood){
            food = food.setScale(0,BigDecimal.ROUND_DOWN);
            System.out.printf("%.0f kilos of food left.", food);
        } else{
            food = food.setScale(0,BigDecimal.ROUND_UP);
            System.out.printf("%.0f more kilos of food are needed.", food);
        }
    }
}
