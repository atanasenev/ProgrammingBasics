import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p03_SqrStar_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int r = 0; r < n; r++) {
            System.out.print("*");
            for (int c = 0; c < n - 1; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}