import java.util.Scanner;

/**
 * Created by Nasko on 17.12.2016 г..
 */
public class p04_ConcatenateData {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String Fname = a.nextLine();
        String Lname = a.nextLine();
        int age = Integer.parseInt(a.nextLine());
        String Town = a.nextLine();

        System.out.print("You are " + Fname + " " + Lname + ", a " + age +"-years old person from " + Town + ".");
    }
}
