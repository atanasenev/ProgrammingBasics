import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p08_TriAr {
    public static void main(String[] args) {

        Scanner chapy = new Scanner(System.in);

        double a = Double.parseDouble(chapy.nextLine());
        double h = Double.parseDouble(chapy.nextLine());
        double area = a*h/2;

        System.out.printf("%.2f%n", area);

    }
}
