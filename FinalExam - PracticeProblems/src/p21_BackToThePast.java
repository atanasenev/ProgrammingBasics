import java.util.Scanner;

/**
 * Created by Atanas on 05/03/2017.
 */
public class p21_BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyInherited = Double.parseDouble(scan.nextLine());
        double liveToYear = Double.parseDouble(scan.nextLine());
        double personsAge = 18;

        for (int i = 1800; i <= liveToYear; i++) {
            if (i % 2 == 0) {
                moneyInherited = moneyInherited - 12000;
                personsAge++;
            } else {
                moneyInherited = moneyInherited - 12000 - (50 * personsAge);
                personsAge++;
            }
        }
        if (moneyInherited >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyInherited);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyInherited));
        }
    }
}