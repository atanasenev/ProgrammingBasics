import java.util.Scanner;

/**
 * Created by Atanas on 24/02/2017.
 */
public class p02_SecretAnswers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int questionNumber = Integer.parseInt(scan.nextLine());
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        String answers = "";

        while (questionNumber > 0) {
            int input = Integer.parseInt(scan.nextLine());
            if (input % 4 == 0){
                counterA +=1;
                answers += "a ";
            } else if (input % 4 == 1){
                counterB +=1;
                answers += "b ";
            } else if (input % 4 == 2){
                counterC +=1;
                answers += "c ";
            } else if (input % 4 == 3){
                counterD +=1;
                answers += "d ";
            }
            questionNumber--;
        }
        System.out.println(answers.trim());
        System.out.printf("Answer A: %d\nAnswer B: %d\nAnswer C: %d\nAnswer D: %d", counterA,counterB,counterC,counterD);
    }
}
