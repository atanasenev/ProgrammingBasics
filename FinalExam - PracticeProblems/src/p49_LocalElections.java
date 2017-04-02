import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Atanas on 17/03/2017.
 */
public class p49_LocalElections {
    static String magic(String symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + symbol;
        }
        return text;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int candidatesNumber = Integer.parseInt(scan.nextLine());
        int chosenCandidate = Integer.parseInt(scan.nextLine());
        String symbol = scan.nextLine().toLowerCase();
        int bulletinCounter = 1;

        System.out.println(".............");

        for (int i = 1; i <= candidatesNumber; i++) {
            String dots = magic(".", 3);
            String topBottomRow = "+-----+";
            String border = "+";
            String midBorder = "|";
            String midDots = magic(".", 5);
            String text = (bulletinCounter < 10 ? "0" : "") + bulletinCounter;
            //Top
            System.out.println(dots + topBottomRow + dots);

            //Mid
            for (int j = 1; j <= 3; j++) {
                if (i == chosenCandidate && symbol.equals("x")) {
                    System.out.println(dots + midBorder + ".\\./." + midBorder + dots);
                    System.out.println(text + "." + midBorder + "..X.." + midBorder + dots);
                    System.out.println(dots + midBorder + "./.\\." + midBorder + dots);
                    break;
                } else if (i == chosenCandidate && symbol.equals("v")) {
                    System.out.println(dots + midBorder + "\\.../" + midBorder + dots);
                    System.out.println(text + "." + midBorder + ".\\./." + midBorder + dots);
                    System.out.println(dots + midBorder + "..V.." + midBorder + dots);
                    break;
                } else {
                    if (j == 2) {
                        System.out.println(text + "." + midBorder + midDots + midBorder + dots);
                    } else {
                        System.out.println(dots + midBorder + midDots + midBorder + dots);
                    }
                }
            }

            //Bottom
            System.out.println(dots + topBottomRow + dots);
            System.out.println(".............");
            bulletinCounter++;
        }
    }
}
