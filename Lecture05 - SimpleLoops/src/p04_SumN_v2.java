import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p04_SumN_v2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numbers = Integer.parseInt(s.nextLine());
        sum(numbers);

    }

    static void sum(int n) {
        Scanner s1 = new Scanner(System.in);
        int b = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s1.nextLine());
            b += a;
        }
        System.out.print(b);

    }
}

