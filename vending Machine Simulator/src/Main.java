import java.util.Scanner;

public class Main {
	public static void getProduct(String productcode) {
		switch(productcode) {
		case "P01":
			System.out.println("Coca cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jal Jeera");
			break;
		case "P05":
			System.out.println("Mountain Dew");
			break;
		case "P06":
			System.out.println("BoatGuava");
			default:
				System.out.println("panaka");
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a product code");
		String productcode=scan.next();
		getProduct(productcode);
		

	}

}
