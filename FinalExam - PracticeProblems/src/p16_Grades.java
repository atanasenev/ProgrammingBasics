import java.util.Scanner;

/**
 * Created by Atanas on 04/03/2017.
 */
public class p16_Grades {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numberOfStudents = Double.parseDouble(scan.nextLine());
        double sumOfAllGrades = 0;
        int excelentStudents = 0;
        int goodStudents = 0;
        int averigeStudents = 0;
        int failedStudents = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            double studentGrade = Double.parseDouble(scan.nextLine());
            sumOfAllGrades += studentGrade;

            if (studentGrade >= 5.00) {
                excelentStudents++;
            } else if (studentGrade >= 4.00 && studentGrade <= 4.99) {
                goodStudents++;
            } else if (studentGrade >= 3.00 && studentGrade <= 3.99) {
                averigeStudents++;
            } else {
                failedStudents++;
            }
        }

        double  excelentStudentPercenage = (excelentStudents / numberOfStudents) * 100.00;
        double goodStudentsPercentage = (goodStudents / numberOfStudents) * 100.00;
        double averageStudentsPercentage =(averigeStudents / numberOfStudents) * 100.00;
        double failedStudentsPercentage = (failedStudents / numberOfStudents) * 100.00;
        double averageGrade = (sumOfAllGrades / numberOfStudents);

        System.out.printf("Top students: %.2f%%\n", excelentStudentPercenage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudentsPercentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", averageStudentsPercentage);
        System.out.printf("Fail: %.2f%%\n", failedStudentsPercentage);
        System.out.printf("Average: %.2f", averageGrade);


    }
}
