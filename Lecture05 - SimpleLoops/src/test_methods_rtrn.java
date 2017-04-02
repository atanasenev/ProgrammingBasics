import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class test_methods_rtrn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Give me another number: ");
        int b = Integer.parseInt(s.nextLine());

        int res = max(a, b);
        int res2 = min(a, b);
        System.out.println(res + " is bigger than " + res2);
        System.out.println(res2 + " is smaller than " + res);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int min(int a, int b) {
        if (a > b){
            return b;
        } else {
            return a;
        }
    }
}
