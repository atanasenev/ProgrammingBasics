import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p15_LetterCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startingLetter = scan.nextLine().charAt(0);
        char endLetter = scan.nextLine().charAt(0);
        char skipLetter = scan.nextLine().charAt(0);
        int counter = 0;

        for (char i = startingLetter; i <= endLetter; i++) {
            if(i == skipLetter){
                continue;
            }
            for (char j = startingLetter; j <= endLetter; j++) {
                if(j == skipLetter){
                    continue;
                }
                for (char k = startingLetter; k <= endLetter; k++) {
                    if (k != skipLetter) {
                        counter++;
                        System.out.print("" + i + j + k + " ");
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
