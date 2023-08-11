package loop;

import java.util.Scanner;

public class whileloop {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int i=scan.nextInt();
	while(i<=10) {
		System.out.println("kodnest");
		i++;
		scan.close();
	}
	System.out.println("============================================");
	int j=21;
	do
	{
		System.out.println("kodnest");
		j++;
	}while(j<30);
	
}

}


