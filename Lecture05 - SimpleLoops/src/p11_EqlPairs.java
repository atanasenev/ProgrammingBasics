import sun.util.resources.cldr.en.CurrencyNames_en;

import java.util.Scanner;

/**
 * Created by Atanas on 05/02/2017.
 */
public class p11_EqlPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int CurrentDiff;
        int LastDiff = 0;
        int Diff = 0;
        int CurrentSum = 0;
        int LastSum;

        // Loop n times
        for (int i = 0; i < n; i++) {
            // initialise additional int; loop that sums ints 2x2
            LastSum = CurrentSum;
            CurrentSum = 0;
            for (int j = 0; j < 2; j++) {
                int a = Integer.parseInt(scan.nextLine());
                CurrentSum += a;
            }

            if (i > 0) {
                CurrentDiff = Math.abs(LastSum - CurrentSum);
                Diff = Math.max(CurrentDiff, LastDiff);
                LastDiff = CurrentDiff;
            }
        }

        // Output
        if (Diff == 0) {
            System.out.println("Yes, value=" + CurrentSum);
        } else {
            System.out.println("No, maxdiff=" + Diff);
        }

    }

}

