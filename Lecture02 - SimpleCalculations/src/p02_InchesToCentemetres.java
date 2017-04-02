import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p02_InchesToCentemetres {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.print("Inches = ");
        Double inch = Double.parseDouble(a.nextLine());
        Double cent = inch*2.54;

        System.out.print("Centimetres = " + cent);
    }
}
