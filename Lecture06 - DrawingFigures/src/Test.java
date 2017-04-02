import java.util.Scanner;

/**
 * Created by Atanas on 17/02/2017.
 */
public class Test {
    public static void main(String[] args) {
        //for (int i = 0; i < 26; i++) {
        //    char upper = (char) ('A' + i);
        //    char lower = (char) ('a' + i);
        //    System.out.println(upper +" " + lower);

        //}
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (char i = 'a'; i <(char)('a' + n) ; i++) {
            System.out.println(i);
        }
    }
}
