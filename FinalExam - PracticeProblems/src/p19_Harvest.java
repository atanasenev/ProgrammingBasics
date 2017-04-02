import java.util.Scanner;

/**
 * Created by Atanas on 05/03/2017.
 */
public class p19_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double landArea = Double.parseDouble(scan.nextLine());
        double litersWinePerSqareMeter = Double.parseDouble(scan.nextLine());
        double litersWineNeeded = Double.parseDouble(scan.nextLine());
        double numberOfWorkers = Double.parseDouble(scan.nextLine());

        double producedWine = ((landArea * 0.4) / 2.5) * litersWinePerSqareMeter;

        if (producedWine >= litersWineNeeded) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                            "%.0f liters left -> %.0f liters per person.\n", Math.floor(producedWine) , Math.ceil((producedWine - litersWineNeeded)),
                   Math.ceil ((producedWine - litersWineNeeded) / numberOfWorkers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(Math.abs(producedWine - litersWineNeeded)));
        }
    }
}
