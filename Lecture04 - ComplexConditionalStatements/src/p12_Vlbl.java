import java.util.Scanner;

/**
 * Created by Atanas on 24/01/2017.
 */
public class p12_Vlbl {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String yearType = s.nextLine();
        int p = Integer.parseInt(s.nextLine());
        int h = Integer.parseInt(s.nextLine());

        int freeW = 48 - h;
        double freeV = (3.0 / 4) * freeW;
        double freeP = (2.0 / 3) * p;
        double gpy = freeV + freeP + h;

        switch (yearType) {
            case "leap":
                double gply = gpy * 1.15;
                System.out.println(Math.floor(gply));
                break;
            case "normal":
                System.out.println(Math.floor(gpy));
                break;
        }
    }
}
