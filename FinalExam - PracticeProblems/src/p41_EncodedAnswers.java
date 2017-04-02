import java.util.Scanner;

/**
 * Created by Atanas on 12/03/2017.
 */
public class p41_EncodedAnswers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int answerA = 0;
        int answerB = 0;
        int answerC = 0;
        int answerD = 0;
        String answers = "";

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scan.nextLine());
            if (input % 4 == 0) {
            answers += "a ";
            answerA++;
            } else if (input % 4 == 1) {
                answers += "b ";
                answerB++;
            } else if (input % 4 == 2) {
                answers += "c ";
                answerC++;
            } else if (input % 4 == 3) {
                answers += "d ";
                answerD++;
            }
        }

        System.out.println(answers.trim());
        System.out.printf("Answer A: %d\n", answerA);
        System.out.printf("Answer B: %d\n", answerB);
        System.out.printf("Answer C: %d\n", answerC);
        System.out.printf("Answer D: %d", answerD);
    }
}
