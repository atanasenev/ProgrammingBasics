import java.util.Scanner;

/**
 * Created by Atanas on 15/03/2017.
 */
public class p48_PerfectGirl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double girlScore = 0;
        int perfectGirls = 0;

        while (true) {
            girlScore = 0;
            String initialInput = scan.nextLine();
            String[] girlInfo = initialInput.split("\\\\");
            if (initialInput.equals("Enough dates!")) {
                break;
            }
            //Weekday Number
            String dayOfWeek = girlInfo[0];

            if (dayOfWeek.equals("Monday")) {
                girlScore += 1;
            } else if (dayOfWeek.equals("Tuesday")) {
                girlScore += 2;
            } else if (dayOfWeek.equals("Wednesday")) {
                girlScore += 3;
            } else if (dayOfWeek.equals("Thursday")) {
                girlScore += 4;
            } else if (dayOfWeek.equals("Friday")) {
                girlScore += 5;
            } else if (dayOfWeek.equals("Saturday")) {
                girlScore += 6;
            } else if (dayOfWeek.equals("Sunday")) {
                girlScore += 7;
            }

            //Phone Number Number?!
            String phoneNumber = girlInfo[1];
            for (int i = 0; i < phoneNumber.length(); i++) {
                int currentDigit = Character.getNumericValue(phoneNumber.charAt(i));

                girlScore += currentDigit;
            }

            //Bra Size NUmber
            String braSize = girlInfo[2];
            int braNumber = Integer.parseInt(braSize.replaceAll("[\\D]", ""));
            double braLetterNumber = braSize.charAt(braSize.length()-1);

            girlScore += (braNumber * braLetterNumber);

            //Name Number

            String name = girlInfo[3];

            int firstLetterNumber = name.charAt(0);
            girlScore -= firstLetterNumber * name.length();

            //Output
            if (girlScore > 6000) {
                perfectGirls++;
                System.out.printf("%s is perfect for you.\n", name);
            } else {
                System.out.printf("Keep searching, %s is not for you.\n", name);
            }

        }
        System.out.println(perfectGirls);
    }
}
