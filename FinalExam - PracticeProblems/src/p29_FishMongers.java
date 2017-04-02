import java.util.Scanner;

/**
 * Created by Atanas on 07/03/2017.
 */
public class p29_FishMongers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double mackrelPrice = Double.parseDouble(scan.nextLine());
        double spratPrice = Double.parseDouble(scan.nextLine());
        double kilogramsBeltedBonto = Double.parseDouble(scan.nextLine());
        double kilogramsScad = Double.parseDouble(scan.nextLine());
        double kilogramsOysters = Double.parseDouble(scan.nextLine());

        double  beltedBontoPrice = mackrelPrice + mackrelPrice * 0.60;
        double costOfBeltedBonto = beltedBontoPrice * kilogramsBeltedBonto;

        double scadPrice = spratPrice + spratPrice * 0.80;
        double costOfScad = scadPrice * kilogramsScad;

        double costOfOysters = kilogramsOysters * 7.50;

        double totalCostOfFish = costOfBeltedBonto + costOfOysters + costOfScad;

        System.out.printf("%02.2f", totalCostOfFish);
    }
}
