import java.util.Scanner;

/**
 * Created by Atanas on 05/02/2017.
 */
public class p10_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double OddSum = 0;
        double EvenSum = 0;
        double OddMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        //entering numbers and adding them to initiated ints
        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(scan.nextLine());
            if (i % 2 != 0) {
                EvenSum += a;
                if (a > EvenMax) {
                    EvenMax = a;
                }
                if (a < EvenMin) {
                    EvenMin = a;
                }
            } else {
                OddSum += a;
                if (a > OddMax) {
                    OddMax = a;
                }
                if (a < OddMin) {
                    OddMin = a;
                }
            }
        }

        //Output code
        System.out.println("OddSum=" + fmt(OddSum));
        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("OddMin=" + fmt(OddMin));
        }
        if (OddMax == -1000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + fmt(OddMax));
        }
        System.out.println("EvenSum=" + fmt(EvenSum));
        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("EvenMin=" + fmt(EvenMin));
        }
        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + fmt(EvenMax));
        }


    }
    // Method for rounding doubles to ints if double = int value Ex. 1.0 -> 1
    public static String fmt(double d) {
        if (d == (int) d)
            return String.format("%d", (int) d);
        else
            return String.format("%s", d);
    }
}
