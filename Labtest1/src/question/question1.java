package question;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		double total,output,price1,price2=0,price3 = 0,quantity1,quantity2=0,quantity3=0,dis;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of item : ");
		int number = scan .nextInt();
		
		if(number==1) {
			System.out.print("Enter price of first item : RM");
			price1 = scan.nextDouble();
			System.out.print("Enter quantity of first item : ");
			quantity1 = scan.nextDouble();
			
			
			}else if(number==2) {
				System.out.print("Enter price of first item : RM");
				price1 = scan.nextDouble();
				System.out.print("Enter quantity of first item : ");
				 quantity1 = scan.nextDouble();
				System.out.print("Enter price of second item : RM");
				 price2 = scan.nextDouble();
				System.out.print("Enter quantity of second item : ");
				 quantity2 = scan.nextDouble();
				
				
				
			}else {
				System.out.print("Enter price of first item : RM");
				 price1 = scan.nextDouble();
				System.out.print("Enter quantity of first item : ");
				quantity1 = scan.nextDouble();
				System.out.print("Enter price of second item : RM");
				 price2 = scan.nextDouble();
				System.out.print("Enter quantity of second item : ");
				 quantity2 = scan.nextDouble();
				System.out.print("Enter price of third item : RM");
				 price3 = scan.nextDouble();
				System.out.print("Enter quantity of third item : ");
				 quantity3 = scan.nextDouble();
				
				
			}
		
		total = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		if(total>100) {
			dis = (total*20)/100;
		}else {
			dis = (total*10)/100;
		}
		output = total -dis;
		System.out.printf("Total price : RM%.2f%n",total);
		System.out.printf("Discount received : RM%.2f%n",dis);
		System.out.printf("Price to be paid : RM%.2f%n",output);
		
	}

}
