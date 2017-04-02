import java.util.Scanner;

/**
 * Created by Atanas on 17/02/2017.
 */
public class p13_SpdPass {
    public static void main(String[] args) {

        // Input
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        char lastletter = (char) ('a' + l);


        // Main symbol randomiser
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (char k = 'a'; k < lastletter; k++) {
                    for (char m = 'a'; m < lastletter; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.print(i + "" + j + "" + k + "" + m + "" + o + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
