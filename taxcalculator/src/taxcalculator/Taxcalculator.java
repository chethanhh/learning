package taxcalculator;

import java.util.Scanner;

public class Taxcalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double purchaseamount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form)");
		double taxrate=scan.nextDouble();
		double totalCostIncludingTax=calculateTotalWithTax(purchaseamount,taxrate);
		System.out.println("totalCostIncludingTax :" +" "+ totalCostIncludingTax );
		scan.close();

	}
	public static double calculateTotalWithTax(double purchaseamount, double taxrate) {
		double res=purchaseamount*taxrate;
		double res1=purchaseamount+res;
		return res1;
	}

}
