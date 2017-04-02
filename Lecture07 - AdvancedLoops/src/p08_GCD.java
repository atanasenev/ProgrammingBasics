import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p08_GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int GCD = 0;
        int i = 1;
        int biggerNum = Math.max(l, n);

        while (i <= biggerNum) {
            if (n % i == 0 && l % i == 0 ){
                GCD = i;
            }
            i++;
        }
        System.out.println(GCD);
    }
}
