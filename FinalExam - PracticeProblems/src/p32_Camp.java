import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p32_Camp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double travellingByCar = 0;
        double travellingByVan = 0;
        double travellingBySmallBus = 0;
        double travellingByBigBus = 0;
        double travellingByTrain = 0;
        double totalNumberOfPeople = 0;

        double numberOfGroups = Double.parseDouble(scan.nextLine());
        for (int i = 0; i < numberOfGroups; i++) {
            double peopleInAGroup = Double.parseDouble(scan.nextLine());
            totalNumberOfPeople += peopleInAGroup;
            if (peopleInAGroup <= 5) {
                travellingByCar += peopleInAGroup;
            } else if (peopleInAGroup > 5 && peopleInAGroup <= 12) {
                travellingByVan += peopleInAGroup;
            } else if (peopleInAGroup > 12 && peopleInAGroup <= 25) {
                travellingBySmallBus += peopleInAGroup;
            } else if (peopleInAGroup > 25 && peopleInAGroup <= 40) {
                travellingByBigBus += peopleInAGroup;
            } else {
                travellingByTrain += peopleInAGroup;
            }
        }

        double percentTravellingByCar = travellingByCar / totalNumberOfPeople * 100;
        double percentTravellingByVan = travellingByVan / totalNumberOfPeople * 100;
        double percentTravellingBySmallBus = travellingBySmallBus / totalNumberOfPeople * 100;
        double percentTravellingByBigBus = travellingByBigBus / totalNumberOfPeople * 100;
        double percentTravellingByTrain = travellingByTrain / totalNumberOfPeople * 100;

        System.out.printf("%.2f%%\n", percentTravellingByCar);
        System.out.printf("%.2f%%\n", percentTravellingByVan);
        System.out.printf("%.2f%%\n", percentTravellingBySmallBus);
        System.out.printf("%.2f%%\n", percentTravellingByBigBus);
        System.out.printf("%.2f%%", percentTravellingByTrain);
    }
}
