import java.util.Scanner;

public class IT24102678Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfSquares = 0; // To store the sum of squares of the numbers
        int count = 0; // To count the number of valid inputs
        System.out.println("Enter positive integers (terminate input with -99):");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Termination condition
            if (number == -99) {
                break;
            }
            // Validation: only positive numbers are allowed
            if (number > 0) {
                sumOfSquares += number * number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
            }
           
        }

       
            // Calculate RMS
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        
        
        scanner.close();
    }
}
