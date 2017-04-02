import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p05_TrapAr {
    public static void main(String[] args){

        Scanner att = new Scanner(System.in);
        Double b1 = Double.parseDouble(att.nextLine());
        Double b2 = Double.parseDouble(att.nextLine());
        Double h = Double.parseDouble(att.nextLine());
        Double area = (b1 + b2)*h/2;

        System.out.println("Trapezoid area = " + area);

    }
}
