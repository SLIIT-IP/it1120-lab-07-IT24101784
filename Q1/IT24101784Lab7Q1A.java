import java.util.Scanner;

public class IT24101784Lab7Q1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numSubjects = 4;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            int mark = scanner.nextInt();
            totalMarks += mark;
        }

        double average = totalMarks / (double) numSubjects;
        System.out.println("Average is: " + average);

        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Overall Grade is: " + grade);
    }
}