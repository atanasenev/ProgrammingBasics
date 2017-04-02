import java.util.Scanner;

/**
 * Created by Nasko on 10.12.2016 г..
 */
public class SqrN {
    public static void main(String[] args) {

        System.out.print("Give me a number between 3 and 99:");

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        if (n >= 2 &&  n <= 100)
        {
            for(int a = 0; a < n; a++)
            {
                System.out.print("*");
            }
            System.out.println("");

            for(int b = 2; b < n; b++)
            {
                System.out.print("*");
                for(int c = 2; c < n; c++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for(int d = 0; d < n; d++)
            {
                System.out.print("*");
            }
        }

        else
        {
            System.out.println("Int is out of range");
        }



    }
}
