import java.util.Scanner;

/**
 * Created by Atanas on 14/01/2017.
 */
public class p04_GrtThan {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        int x = Integer.parseInt(a.nextLine());
        int y = Integer.parseInt(a.nextLine());

        if (x > y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }

    }
}
