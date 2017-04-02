import java.util.Scanner;

/**
 * Created by Atanas on 12/01/2017.
 */
public class p14_VFS {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);

        double vprice = Double.parseDouble(x.nextLine());
        double fprice = Double.parseDouble(x.nextLine());
        int vkg = Integer.parseInt(x.nextLine());
        int fkg = Integer.parseInt(x.nextLine());

        double vin = vprice * vkg;
        double fin = fprice * fkg;

        double inEUR = (vin + fin)/1.94;

        System.out.printf("%.13f", inEUR);

    }
}
