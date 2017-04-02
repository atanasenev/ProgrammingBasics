import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p35_HousePrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double smallestRoomArea = Double.parseDouble(scan.nextLine());
        double kitchenArea = Double.parseDouble(scan.nextLine());
        double pricePerSqareMeter = Double.parseDouble(scan.nextLine());

        double bathroom = smallestRoomArea * 0.50;
        double secondRoom = smallestRoomArea + smallestRoomArea * 0.10;
        double thirdRoom = secondRoom + secondRoom * 0.10;
        double areaOfAllRooms = smallestRoomArea + kitchenArea + bathroom + secondRoom + thirdRoom;
        double corridorArea = areaOfAllRooms * 0.05;

        double totalAppartmentArea = areaOfAllRooms + corridorArea;
        double totalAppartmentPrice = totalAppartmentArea * pricePerSqareMeter;

        System.out.printf("%.2f",totalAppartmentPrice);
    }
}
