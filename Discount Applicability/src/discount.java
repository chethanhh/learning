import java.util.Scanner;

public class discount {

			public static void checkDiscount(double purchaseAmount)

			{
             if(purchaseAmount>100) {
            	 System.out.println("Discount applicable");
          
             }

			}

			public static void main(String[] args)

			{
				Scanner scan=new Scanner(System.in);
	             System.out.println(" ");
	             double  purchaseAmount=scan.nextDouble();
	             checkDiscount( purchaseAmount);
			

			}

	}


