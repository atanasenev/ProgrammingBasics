import java.util.Scanner;

/**
 * Created by Atanas on 06/03/2017.
 */
public class p25_HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String monthOfStay = scan.nextLine().toLowerCase();
        double numberOfNights = Double.parseDouble(scan.nextLine());
        double pricePerNightApartment = 0;
        double pricePerNightStudio = 0;
        double discountPercentApartment = 0;
        double discountPercentStudio = 0;


        if (monthOfStay.equals("may") || monthOfStay.equals("october")) {
            pricePerNightApartment = 65;
            pricePerNightStudio = 50;

            if (numberOfNights > 14) {
                discountPercentStudio = 0.3;
            } else if (numberOfNights <=14 && numberOfNights > 7){
                discountPercentStudio = 0.05;
            }
        } else if (monthOfStay.equals("june") || monthOfStay.equals("september")) {
            pricePerNightApartment = 68.70;
            pricePerNightStudio = 75.20;
            if (numberOfNights >14){
                discountPercentStudio = 0.2;
            }
        } else {
            pricePerNightApartment = 77;
            pricePerNightStudio = 76;
        }

        if (numberOfNights > 14) {
            discountPercentApartment = 0.1;
        }

        double totalPriceForStayApartment = (pricePerNightApartment * numberOfNights) - (pricePerNightApartment * numberOfNights * discountPercentApartment);
        double totalPriceForStayStudio = (pricePerNightStudio * numberOfNights) - (pricePerNightStudio * numberOfNights * discountPercentStudio);



        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", totalPriceForStayApartment,
                totalPriceForStayStudio);
    }
}
