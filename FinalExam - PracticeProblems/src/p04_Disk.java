import java.util.Scanner;

/**
 * Created by Atanas on 19/02/2017.
 */
public class p04_Disk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int R = Integer.parseInt(scan.nextLine());

        String dot = ".";

        for (int i = -N/2; i <= N/2; i++) {
            for (int j = -N/2; j <= N/2; j++) {
                if (R*R >= i*i + j*j) {
                    dot = dot.replace(dot, "*");
                }
                System.out.print(dot);
                dot = dot.replace(dot, ".");
            }
            System.out.println();
        }

    }
}
