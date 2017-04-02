import java.util.Scanner;

/**
 * Created by Atanas on 14/03/2017.
 */
public class p47_Beer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int reservedBeersNumber = Integer.parseInt(scan.nextLine());
        int beersNumber = 0;
        int totalNumberOfBeers = 0;

        while (true) {
            String[] beerOrder = scan.nextLine().split(" ");

            if (beerOrder[0].equals("Exam")) {
                break;
            }

            String orderType = beerOrder[1];
            int numberOfOrderedType = Integer.parseInt(beerOrder[0]);

            if (orderType.equals("beers")) {
                beersNumber += numberOfOrderedType;
            } else if (orderType.equals("sixpacks")) {
                beersNumber += 6 * numberOfOrderedType;
            } else if (orderType.equals("cases")) {
                beersNumber += 24 * numberOfOrderedType;
            }
        }

        totalNumberOfBeers = beersNumber - (beersNumber / 100);
        int totalStockLeft = Math.abs(totalNumberOfBeers - reservedBeersNumber);
        int casesLeft = totalStockLeft / 24;
        int sixpacksLeft = (totalStockLeft % 24) / 6;
        int beersLeft = totalStockLeft - 24 * casesLeft - 6 * sixpacksLeft;

        if (totalNumberOfBeers >= reservedBeersNumber) {

            System.out.printf("Cheers! Beer left: %d cases, %d sixpacks and %d beers.", casesLeft, sixpacksLeft, beersLeft);
        } else {
            System.out.printf("Not enough beer. Beer needed: %d cases, %d sixpacks and %d beers.", casesLeft, sixpacksLeft, beersLeft);
        }

    }
}
