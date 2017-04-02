import com.sun.corba.se.spi.orbutil.fsm.InputImpl;

import java.util.Scanner;

/**
 * Created by Atanas on 23/02/2017.
 */
public class p00_Incriptor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        int i = 0;

        while (i < Input.length()) {

            char First = Input.charAt(Input.length() - (Input.length() - i));
            char Next = ++First;
            if(First != '!'){
                System.out.print(Next);
                i++;
            } else{
                System.out.print(" ");
                i++;
            }


        }
    }
}
