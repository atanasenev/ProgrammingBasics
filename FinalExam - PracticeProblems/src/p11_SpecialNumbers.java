import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p11_SpecialNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        for (int i = 1; i <= 9; i++) {
            if (n % i == 0) {
                num1 = i;
            } else {
                continue;
            }
            for (int j = 1; j <= 9; j++) {
                if (n % j == 0) {
                    num2 = j;
                } else {
                    continue;
                }
                for (int k = 1; k <= 9; k++) {
                    if (n % k == 0) {
                        num3 = k;
                    } else {
                        continue;
                    }
                    for (int l = 1; l <= 9; l++) {
                        if (n % l == 0) {
                            num4 = l;
                            System.out.printf("%d%d%d%d ", num1, num2, num3, num4);
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}

