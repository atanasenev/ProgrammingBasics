import java.util.Scanner;

/**
 * Created by Atanas on 29/01/2017.
 */
public class p13_InsOuts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declare input
        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        //declare variables
        int x1 = 0;
        int y1 = 0;
        int x2 = 3 * h;
        int x6 = 2 * h;
        int y8 = 4 * h;


        //logic
        boolean inSide1 = ((x > x1) && (x < x2) && ((y > y1) && (y < h)));
        boolean inSide2 = ((x > h) && (x < x6) && ((y > h) && (y < y8)));
        boolean inSide3 = ((x > h) && (x < x6) && y == h);

        boolean outSide1 = ((x < x1) || (x > x2) || ((y < y1) || (y > h)));
        boolean outSide2 = ((x < h) || (x > x6) || ((y < h) || (y > y8)));

        if (inSide1 || inSide2 || inSide3) {
            System.out.println("inside");
        } else if (outSide1 && outSide2) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }
    }
}
