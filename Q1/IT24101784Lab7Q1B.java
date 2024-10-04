import java.util.Scanner;

public class IT24101784Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.println("Enter marks for four subjects (separated by spaces):");
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();


            double average = (mark1 + mark2 + mark3 + mark4) / 4;
            System.out.println("Average is: " + average);


            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Overall Grade is: Credit");
            } else {
                System.out.println("Overall Grade is: Fail");
            }

            System.out.println();  // Blank line for spacing
        }

        scanner.close();
    }
}
