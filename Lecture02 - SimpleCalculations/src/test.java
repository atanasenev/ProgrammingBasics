import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        double c = Math.abs(Math.abs(a) - Math.abs(b));
        System.out.println(c);

    }
}
