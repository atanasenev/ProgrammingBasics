import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p13_ChangeTiles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double moneySaved = Double.parseDouble(scan.nextLine());
        double floorWidth = Double.parseDouble(scan.nextLine());
        double floorLength = Double.parseDouble(scan.nextLine());
        double triangleTileSideLength = Double.parseDouble(scan.nextLine());
        double triangleTileHeigth = Double.parseDouble(scan.nextLine());
        double triangleTilePrice = Double.parseDouble(scan.nextLine());
        double handymanLabourCost = Double.parseDouble(scan.nextLine());

        double floorArea = floorLength * floorWidth;
        double tileArea = (triangleTileHeigth * triangleTileSideLength) / 2;

        double numberTilesNeeded = Math.ceil(floorArea / tileArea) + 5;
        double totalTilePrice = numberTilesNeeded * triangleTilePrice;

        if (moneySaved >= totalTilePrice + handymanLabourCost){
            System.out.printf("%.2f lv left.", (moneySaved - (totalTilePrice + handymanLabourCost)));
        } else{
            System.out.printf("You'll need %.2f lv more.", Math.abs(moneySaved - (totalTilePrice + handymanLabourCost)));
        }
    }
}
