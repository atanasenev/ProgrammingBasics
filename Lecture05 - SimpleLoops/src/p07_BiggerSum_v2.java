import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p07_BiggerSum_v2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        int res1 = 0;
        int res2 = 0;
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(s.nextLine());
            if (i % 2 == 0) {
                res1 += a;
            } else {
                res2 += a;
            }
        }
        if (res1 == res2) {
            System.out.println("Yes, sum = " + res1);
        } else {
            System.out.println("No, diff = " + (Math.max(res1, res2) - Math.min(res1, res2)));
        }
    }
}
