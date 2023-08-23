package taxcalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Bitwiseoperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first integer");
		int a=scan.nextInt();
		System.out.println("enter second integer");
		int b=scan.nextInt();
		swapUsingBitwise(a,b);
	
	}
	public static void swapUsingBitwise(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping:" +" "+"First="+a+" "+"second="+b);
	
	}

}
