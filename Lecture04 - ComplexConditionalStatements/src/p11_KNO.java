import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p11_KNO {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        String type = a.nextLine();
        int r = Integer.parseInt(a.nextLine());
        int c = Integer.parseInt(a.nextLine());
        int seats = r * c;
        DecimalFormat f = new DecimalFormat("#######.###");

        if (type.equals("Premiere")){
            double income = seats * 12;
            System.out.println(f.format(income) + " leva");
        } else if (type.equals("Normal")){
            double income = seats * 7.50;
            System.out.println(f.format(income) + " leva");
        } else if (type.equals("Discount")){
            double income = seats * 5;
            System.out.println(f.format(income) + " leva");
        }
    }
}
