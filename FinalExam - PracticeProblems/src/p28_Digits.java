import java.util.Scanner;

/**
 * Created by Atanas on 07/03/2017.
 */
public class p28_Digits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int wholeNumber = Integer.parseInt(input);

        int firstNumber = Character.getNumericValue(input.charAt(0));
        int secondNumber = Character.getNumericValue(input.charAt(1));
        int thirdNumber = Character.getNumericValue(input.charAt(2));


        int numberOfRows = firstNumber + secondNumber;
        int numberOfDigits = firstNumber + thirdNumber;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfDigits; j++) {
                if (wholeNumber % 5 == 0) {
                    wholeNumber = wholeNumber - firstNumber;
                } else if (wholeNumber % 3 == 0) {
                    wholeNumber = wholeNumber - secondNumber;
                } else {
                    wholeNumber = wholeNumber + thirdNumber;
                }
                System.out.print(wholeNumber + " ");
            }
            System.out.println();
        }
    }
}
