import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p07_RecAr {
    public static void main(String[] args)
    {
        Scanner chapy = new Scanner(System.in);

        Double x1 = Double.parseDouble(chapy.nextLine());
        Double y1 = Double.parseDouble(chapy.nextLine());
        Double x2 = Double.parseDouble(chapy.nextLine());
        Double y2 = Double.parseDouble(chapy.nextLine());

        Double l = Math.abs(Math.abs(x1) - Math.abs(x2));
        Double h = Math.abs(Math.abs(y1) - Math.abs(y2));

        Double volume = l*h;
        Double perimeter = 2*(l+h);

        System.out.println(volume);
        System.out.println(perimeter);

    }
}
