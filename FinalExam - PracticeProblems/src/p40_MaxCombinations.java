import java.util.Scanner;

/**
 * Created by Atanas on 11/03/2017.
 */
public class p40_MaxCombinations {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int intervalStart = Integer.parseInt(scan.nextLine());
        int intervalEnd = Integer.parseInt(scan.nextLine());
        int maximumCombinations = Integer.parseInt(scan.nextLine());
        int currentNumberOfCombinations = 0;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            for (int j = intervalStart; j <= intervalEnd ; j++) {
                if(currentNumberOfCombinations == maximumCombinations){
                    break;
                }
                System.out.printf("<%d-%d>",i,j);
                currentNumberOfCombinations++;
            }
        }
    }
}
