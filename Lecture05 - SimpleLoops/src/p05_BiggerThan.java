import java.util.Scanner;

/**
 * Created by Atanas on 04/02/2017.
 */
public class p05_BiggerThan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = Integer.MIN_VALUE;
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            int a =Integer.parseInt(s.nextLine());
            if(a > b){
                b = a;
            }
        }
        System.out.println(b);
    }

}


