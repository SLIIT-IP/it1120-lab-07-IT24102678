import java.util.Scanner;

public class IT24102678Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int mark1, mark2, mark3, mark4;

        // Input marks for four subjects
        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter Subject Mark 2: ");
        mark2 = scanner.nextInt();
        System.out.print("Enter Subject Mark 3: ");
        mark3 = scanner.nextInt();
        System.out.print("Enter Subject Mark 4: ");
        mark4 = scanner.nextInt();


        // Calculate the average
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        System.out.printf("Average is : %.2f\n", average);
        // Determine the grade based on the average
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50 && average <= 74) {
            System.out.println("Overall Grade is : Credit");
        } else if (average >= 0 && average <= 49) {
            System.out.println("Overall Grade is : Fail");
        } else {
            System.out.println("Invalid Marks");
        }

        scanner.close();
    }
}
