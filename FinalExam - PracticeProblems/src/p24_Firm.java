import java.util.Scanner;

/**
 * Created by Atanas on 06/03/2017.
 */
public class p24_Firm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double hoursNeededForTaskCompletion = Double.parseDouble(scan.nextLine());
        double workDaysAvailable = Double.parseDouble(scan.nextLine());
        double workersWorkingOvertime = Double.parseDouble(scan.nextLine());

        double actualWorkDaysAvailable = workDaysAvailable - (0.1 * workDaysAvailable);
        double regularWorkHours = actualWorkDaysAvailable * 8;
        double additionalWorkHours = workersWorkingOvertime * (workDaysAvailable * 2);

        double timeLeftForTask = (regularWorkHours + additionalWorkHours) - hoursNeededForTaskCompletion;

        if (timeLeftForTask >= 0) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(timeLeftForTask));
        } else{
            System.out.printf("Not enough time!%.0f hours needed.",Math.abs(Math.floor(timeLeftForTask)) );
        }
    }
}
