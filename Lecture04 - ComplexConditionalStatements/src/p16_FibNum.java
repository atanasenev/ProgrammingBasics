import java.util.Scanner;

/**
 * Created by Atanas on 01/02/2017.
 */
public class p16_FibNum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers of the Fibonacci sequence do you want printed: ");
        int n = Integer.parseInt(s.nextLine());

        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i= 0; i < n - 1; i++) {
            int c = b + a;
            System.out.println(c);
            a = b;
            b = c;
        }


    }
}
