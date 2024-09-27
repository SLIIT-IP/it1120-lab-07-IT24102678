import java.util.Scanner;

	public class IT24102678LAB7Q3{

		public static void main (String[] args){

		Scanner scanner=new Scanner(System.in);


		for(int i=1;i<=5;i++){

		System.out.println("customer" +i);
		System.out.print("Enter total bill amount:");
		int totalBill=scanner.nextInt();

		System.out.print("Enter mode of payment(c for cash,o for other:");
		  char paymentMode=scanner.next().charAt(0);

		if(paymentMode== 'C' || paymentMode== 'c'){
		double discount=0.05 * totalBill;
		double amountTopay=totalBill-discount;

		System.out.println("Discount is :"+discount);
		System.out.print("Amount to be paid:"+amountTopay);

		}else if(paymentMode == 'o'||paymentMode == 'O' ){
		System.out.print("No discount applicable");

		}else{
		System.out.println("Payment method is not valid");

		}
		System.out.println();

		}
		scanner.close();

	}
}



		

