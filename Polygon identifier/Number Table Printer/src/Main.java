import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		printTable(num);
		

	}
	public static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" "+"*"+" "+i+"="+(num*i));
		}
	}

}
