import java.util.Scanner;

/**
 * Created by Atanas on 03/02/2017.
 */
public class test_loops_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers will we compare: ");
        int n = Integer.parseInt(s.nextLine());
        int a = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Give me an int: ");
            int num = Integer.parseInt(s.nextLine());
            if (num > a) {
                a = num;
            }
        }
        System.out.println("The biggest int is " + a);
    }
}
