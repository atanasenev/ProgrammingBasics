import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p06_CirAr {
    public static void main(String[] args){
        Scanner ae = new Scanner(System.in);
        Double r = Double.parseDouble(ae.nextLine());
        Double area = Math.PI*r*r;
        Double volume = r*Math.PI*2;

        System.out.printf("Area = %.13f%n", area);
        System.out.printf("Volume = %.13f", volume);
    }
}
