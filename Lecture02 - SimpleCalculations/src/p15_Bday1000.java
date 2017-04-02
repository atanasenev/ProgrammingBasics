import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 * Created by Atanas on 14/01/2017.
 */
public class p15_Bday1000 {
    public static void main(String[] args){

        //Get a starting date in the format dd-MM-yyyy

        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate today = LocalDate.parse(date, formatter);

        //Calculate +1000 days from that date

        LocalDate date1000 = today.plus(999, ChronoUnit.DAYS);

        //Return the starting date + 1000 days in the format dd-MM-yyyy

        System.out.println(formatter.format(date1000));

    }
}






