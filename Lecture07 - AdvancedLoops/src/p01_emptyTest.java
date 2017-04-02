import java.util.Scanner;

/**
 * Created by Atanas on 18/02/2017.
 */
public class p01_emptyTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while ( n > 3){
            System.out.println(n);
            n++;
            if ( n > 7){
                break;
            }
        }
    }
}
