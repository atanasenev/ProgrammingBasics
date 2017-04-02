import java.util.Scanner;

/**
 * Created by Atanas on 12/03/2017.
 */
public class p43_PassionDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Initiation and input
        double moneyAvailable = Double.parseDouble(scan.nextLine());
        String inputData = scan.nextLine();
        int numberOfPurchases = 0;

        //Input check
        while (!inputData.equals("mall.Enter")) {
            //System.out.println("Acceptable commands: mall.Enter");
            inputData = scan.nextLine();
        }

        //Main loop
        while (true) {
            inputData = scan.nextLine();
            if(inputData.equals("mall.Exit")){
                break;
            }
            for (int i = 0; i < inputData.length(); i++) {
                double currentTransactionValue = inputData.charAt(i);
                //Conditions of purchase
                if (currentTransactionValue >= 65 && currentTransactionValue <= 90) {
                    currentTransactionValue = currentTransactionValue / 2;
                } else if (currentTransactionValue >= 97 && currentTransactionValue <= 122) {
                    currentTransactionValue = currentTransactionValue - 0.7 * currentTransactionValue;
                } else if (inputData.charAt(i) == '%') {
                    currentTransactionValue = moneyAvailable / 2;
                } else if (inputData.charAt(i) == '*') {
                    moneyAvailable += 10;
                    continue;
                }

                //Conditions of transaction
                if (moneyAvailable == 0){
                    break;
                } else if (moneyAvailable >= currentTransactionValue) {
                    moneyAvailable = moneyAvailable - currentTransactionValue;
                    numberOfPurchases++;
                } else {
                    continue;
                }
            }
        }

        //Output
        if (numberOfPurchases > 0) {
            System.out.printf("%d purchases. Money left: %.2f lv.", numberOfPurchases, moneyAvailable);
        } else {
            System.out.printf("No purchases. Money left: %.2f lv.", moneyAvailable);
        }
    }
}
