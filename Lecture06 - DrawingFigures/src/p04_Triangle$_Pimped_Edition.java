import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Atanas on 11/02/2017.
 */
public class p04_Triangle$_Pimped_Edition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p = n - (n - 1);
        int g = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < g; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < p; s++) {
                System.out.print("$");
            }

            p++;
            g--;
            System.out.println();
        }
    }
}

