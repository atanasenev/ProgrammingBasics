import java.util.Scanner;

/**
 * Created by Atanas on 18/03/2017.
 */
public class p53_Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int turnsNumber = Integer.parseInt(scan.nextLine());
        double allNumbers = 0;
        double numbersA = 0;
        double numbersB = 0;
        double numbersC = 0;
        double numbersD = 0;
        double numbersE = 0;
        double numbersInvalid = 0;
        double totalScore = 0;

        for (int i = 0; i < turnsNumber; i++) {
            double turnScore = Double.parseDouble(scan.nextLine());
            if (turnScore >= 0 && turnScore <= 9) {
                totalScore += turnScore * 0.2;
                numbersA++;
                allNumbers++;
            } else if (turnScore >= 10 && turnScore <= 19) {
                totalScore += turnScore * 0.3;
                numbersB++;
                allNumbers++;
            } else if (turnScore >= 20 && turnScore <= 29) {
                totalScore += turnScore * 0.4;
                numbersC++;
                allNumbers++;
            } else if (turnScore >= 30 && turnScore <= 39) {
                totalScore += 50;
                numbersD++;
                allNumbers++;
            } else if (turnScore >= 40 && turnScore <= 50) {
                totalScore += 100;
                numbersE++;
                allNumbers++;
            } else if (turnScore < 0 || turnScore > 50) {
                totalScore = totalScore / 2;
                numbersInvalid++;
                allNumbers++;
            }

        }

        double numbersAPercent = numbersA / allNumbers * 100;
        double numbersBPercent = numbersB / allNumbers * 100;
        double numbersCPercent = numbersC / allNumbers * 100;
        double numbersDPercent = numbersD / allNumbers * 100;
        double numbersEPercent = numbersE / allNumbers * 100;
        double invalidNumbersPercent = numbersInvalid / allNumbers * 100;

        System.out.printf("%.2f\n", totalScore);
        System.out.printf("From 0 to 9: %.2f%%\n", numbersAPercent);
        System.out.printf("From 10 to 19: %.2f%%\n", numbersBPercent);
        System.out.printf("From 20 to 29: %.2f%%\n", numbersCPercent);
        System.out.printf("From 30 to 39: %.2f%%\n", numbersDPercent);
        System.out.printf("From 40 to 50: %.2f%%\n", numbersEPercent);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumbersPercent);
    }
}
