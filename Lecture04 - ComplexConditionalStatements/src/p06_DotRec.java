import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p06_DotRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = Integer.parseInt(s.nextLine());
        int y1 = Integer.parseInt(s.nextLine());
        int x2 = Integer.parseInt(s.nextLine());
        int y2 = Integer.parseInt(s.nextLine());
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());

        if (((x > x1) && (x < x2)) && ((y > y1) && (y < y2))){
            System.out.println("Inside");
        } else if ((x == x1 && y >= y1 && y <= y2) || ((x==x2 && y >= y1 && y <= y2)) ||
                ((y == y1) && x > x1 && x < x2) || ((y == y2 && x > x1 && x < x2))){
            System.out.println("Boarder");

        } else {
            System.out.println("Outside");
        }
    }
}
