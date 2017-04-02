import java.util.Scanner;

/**
 * Created by Atanas on 21/01/2017.
 */
public class p01_GenW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double age = Double.parseDouble(s.nextLine());
        String gen = s.nextLine();

        if (gen.equals("f") && age < 16){
            System.out.println("Miss");
        } else if (gen.equals("f") && age >=16){
            System.out.println("Ms.");
        }
        if (gen.equals("m") && age < 16){
            System.out.println("Master");
        } else if (gen.equals("m") && age >=16){
            System.out.println("Mr.");
        }
    }
}
