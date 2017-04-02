import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p06_SmallerThan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = Integer.MAX_VALUE;
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s.nextLine());
            if (a < b) {
                b = a;
            }
        }
        System.out.println(b);
    }

}

