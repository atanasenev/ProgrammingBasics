import java.util.Scanner;

/**
 * Created by Nasko on 21.12.2016 г..
 */
public class p10_RadGrad {
    public static void main(String[] args){

        Scanner chapy = new Scanner(System.in);

        double rad = Double.parseDouble(chapy.nextLine());
        double grad = (rad * 180) / Math.PI;

        System.out.print(Math.round(grad));
    }
}
