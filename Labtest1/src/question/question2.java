package question;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		double  commission=0,basic,wages;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter sales : RM");
		double sales = scan.nextDouble();
		System.out.print("Enter hours worked : ");
		double hour = scan.nextDouble();
		
		
		if(sales>=150.00 && sales<=300.00) {
			commission = (sales *5)/100;	
		}else if(sales>=301.00 && sales<=500.00){
			commission = (sales *10)/100;
		}else if(sales>500.00) {
			commission = (sales *15)/100;
		}
		
		basic = hour*5;
		wages=basic+commission;
		
		System.out.printf("Commision : RM%.2f%n",commission);
		System.out.printf("Daily wages : RM%.2f%n",wages);
		
	}

}
