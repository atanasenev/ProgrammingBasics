import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p18_Money_BigDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputBitcoin = scan.nextLine();
        String inputUan = scan.nextLine();
        String inputComission = scan.nextLine();
        BigDecimal uanToUSD = new BigDecimal(0.15);
        BigDecimal usdToBGN = new BigDecimal(1.76);
        BigDecimal persentConverter = new BigDecimal(100);
        BigDecimal bitcoinToBGN = new BigDecimal(1168);
        BigDecimal bgnToEUR = new BigDecimal(1.95);

        BigDecimal bitcoinAmountToBGN = new BigDecimal(inputBitcoin).multiply(bitcoinToBGN);
        BigDecimal uanAmountInBGN = new BigDecimal(inputUan).multiply(uanToUSD).multiply(usdToBGN);
        BigDecimal totalFundsInBGN = bitcoinAmountToBGN.add(uanAmountInBGN);
        BigDecimal totalFundsInEUR = totalFundsInBGN.divide(bgnToEUR, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal comissionAmountInEUR = new BigDecimal(inputComission).divide(persentConverter).multiply(totalFundsInEUR);
        BigDecimal totalAvailableFunds = totalFundsInEUR.subtract(comissionAmountInEUR).setScale(10, BigDecimal.ROUND_CEILING);


        System.out.println(totalAvailableFunds.toString());


    }
}
