import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p18_Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double bitcoinAmount = Double.parseDouble(scan.nextLine());
        double uanAmount = Double.parseDouble(scan.nextLine());
        double comissionPercent = Double.parseDouble(scan.nextLine());


        double totalConvertedAmountBGN = (bitcoinAmount * 1168) + (uanAmount * 0.15);
        double totalConvertedAmountEUR = totalConvertedAmountBGN / 1.95;

        double comission = comissionPercent / 100 * totalConvertedAmountEUR;
        double totalAvailableFunds = totalConvertedAmountEUR - comission;

        System.out.println(totalAvailableFunds);
    }
}
