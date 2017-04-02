import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p06_DotRec_v2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1 = Double.parseDouble(s.nextLine());
        double y1 = Double.parseDouble(s.nextLine());
        double x2 = Double.parseDouble(s.nextLine());
        double y2 = Double.parseDouble(s.nextLine());
        double x = Double.parseDouble(s.nextLine());
        double y = Double.parseDouble(s.nextLine());

        if ((x == x1 && y >= y1 && y <= y2) || ((x == x2 && y >= y1 && y <= y2)) ||
                ((y == y1) && x > x1 && x < x2) || ((y == y2 && x > x1 && x < x2))) {
            System.out.println("Border");

        } else {
            System.out.println("Inside / Outside");
        }
    }
}

