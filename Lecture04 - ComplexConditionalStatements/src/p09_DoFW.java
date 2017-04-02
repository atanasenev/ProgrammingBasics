import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p09_DoFW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());

        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                default:
                    System.out.println("Error");
        }
    }
}
