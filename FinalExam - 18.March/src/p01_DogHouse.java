import java.util.Scanner;

/**
 * Created by Atanas on 18/03/2017.
 */
public class p50_DogHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideLength = Double.parseDouble(scan.nextLine());
        double houseHeight = Double.parseDouble(scan.nextLine());

        double twoSidesOfHouse = 2 * (sideLength * (sideLength / 2));
        double backSideOfHouse = ((sideLength / 2) * (sideLength / 2)) + (((sideLength / 2) * (houseHeight - (sideLength / 2))) / 2);
        double frontSideOfHouse = backSideOfHouse - ((sideLength / 5) * (sideLength / 5));
        double allSidesArea = twoSidesOfHouse + backSideOfHouse + frontSideOfHouse;

        double allRoofArea = 2 * (sideLength * (sideLength / 2));

        double greenPaintNeeded = allSidesArea/3;
        double redPaintNeeded = allRoofArea/5;

        System.out.printf("%.2f\n", greenPaintNeeded);
        System.out.printf("%.2f", redPaintNeeded);

    }
}
