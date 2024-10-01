import java.util.Scanner;
public class IT24102678LAB7Q1B{
	public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);
	int students=3;
	int totalMarks=0;
	int subjects=4;
	for(int i=1;i<=3;i++){

	System.out.println("Student"+ i);

	for(int j=1;j<=4;j++){

	System.out.print("Enter marks :");
	int marks=scanner.nextInt();
	
	totalMarks+=marks;

	}

	// Calculate the average
            double average = totalMarks / 4.0;

            // Output the average
            System.out.printf("Average is : %.2f\n", average);

            // Determine and display the grade based on the average
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50 && average <= 74) {
                System.out.println("Overall Grade is : Credit");
            } else if (average >= 0 && average <= 49) {
                System.out.println("Overall Grade is : Fail");
            } else {
                System.out.println("Invalid Marks");
            }

            // Blank line for separation
            System.out.println();
        }

        scanner.close();
    }
}

	

	