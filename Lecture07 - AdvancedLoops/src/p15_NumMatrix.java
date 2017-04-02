import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p15_NumMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            int h = n - 1;
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int j = n - 1; j > n - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
