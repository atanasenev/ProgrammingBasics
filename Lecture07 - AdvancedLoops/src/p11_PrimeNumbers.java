import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p11_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String type = "Prime";

        if (n <= 3 && n > 1) {
            System.out.println(type);
        } else if (n <= 1){
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
                if (n % i == 0) {
                    type = "Not Prime";
                }
            }
            System.out.println(type);
        }
    }
}
