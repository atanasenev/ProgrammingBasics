import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p02_ExorNo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double grade = Double.parseDouble(a.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
