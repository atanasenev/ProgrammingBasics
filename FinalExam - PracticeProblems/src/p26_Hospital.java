import java.util.Scanner;

/**
 * Created by Atanas on 06/03/2017.
 */
public class p26_Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int periodForMedicalChecks = Integer.parseInt(scan.nextLine());
        int doctorsHired = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= periodForMedicalChecks; i++) {

            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                doctorsHired++;
            }

            int dailyPatients = Integer.parseInt(scan.nextLine());

            if (dailyPatients > doctorsHired) {
                untreatedPatients += dailyPatients - doctorsHired;
                treatedPatients += doctorsHired;
            } else {
                treatedPatients += dailyPatients;
            }
        }

        System.out.printf("Treated patients: %d.\nUntreated patients: %d.", treatedPatients, untreatedPatients);
    }
}
