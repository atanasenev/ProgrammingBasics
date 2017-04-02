import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p03_Greeting {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
