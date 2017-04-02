import java.util.Scanner;

/**
 * Created by Atanas on 18/03/2017.
 */
public class p56_SumOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int combination = 0;
        int validCombination = 0;

        for (int i = startNum; i <= endNum; i++) {
            if (validCombination>0){
                break;
            }
            for (int j = startNum; j <= endNum; j++) {
                combination++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum);
                    validCombination++;
                    break;
                }
            }

        }
        if(validCombination == 0){
            System.out.printf("%d combinations - neither equals %d", combination,magicNum);
        }
    }
}
