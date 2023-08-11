package _3_Double_Trouble;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get double");
		int num = scan.nextInt();
		System.out.println("Double = "+doubleTheNumber(num));
		scan.close();

	}

	public static int doubleTheNumber(int num) {
		return num * 2;
	}
}
