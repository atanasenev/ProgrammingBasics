import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p38_Logistics {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double minivanTransportPricePerTon = 200;
        double truckTransportPricePerTon = 175;
        double trainTransportPricePerTon = 120;

        double minivanTransportedCargoInTons = 0;
        double truckTransportedCargoInTons = 0;
        double trainTransportetCargoInTons = 0;

        double totalCargoTransportedInTons = 0;

        double numberOfLoads = Double.parseDouble(scan.nextLine());
        for (int i = 0; i < numberOfLoads; i++) {
            double load = Double.parseDouble(scan.nextLine());
            totalCargoTransportedInTons += load;
            if (load <= 3) {
                minivanTransportedCargoInTons += load;
            } else if (load > 3 && load <= 11) {
                truckTransportedCargoInTons += load;
            } else if (load > 11) {
                trainTransportetCargoInTons += load;
            }
        }

        double revenueFromMinivanTransportedCargo = minivanTransportedCargoInTons * minivanTransportPricePerTon;
        double revenueFromTruckTransportedCargo = truckTransportedCargoInTons * truckTransportPricePerTon;
        double revenueFromTrainTransportedCargo = trainTransportetCargoInTons * trainTransportPricePerTon;

        double totalRevenue = revenueFromMinivanTransportedCargo + revenueFromTrainTransportedCargo + revenueFromTruckTransportedCargo;
        double medianTransportationPricePerTon = totalRevenue / totalCargoTransportedInTons;

        double percentageCargoTransportedViaMinivan = minivanTransportedCargoInTons / totalCargoTransportedInTons * 100;
        double percentageCargoTransportedViaTruck = truckTransportedCargoInTons / totalCargoTransportedInTons * 100;
        double percentageCargoTransportedViaTrain = trainTransportetCargoInTons / totalCargoTransportedInTons * 100;

        System.out.printf("%.2f\n",medianTransportationPricePerTon);
        System.out.printf("%.2f%%\n",percentageCargoTransportedViaMinivan);
        System.out.printf("%.2f%%\n",percentageCargoTransportedViaTruck);
        System.out.printf("%.2f%%\n",percentageCargoTransportedViaTrain);
    }
}
