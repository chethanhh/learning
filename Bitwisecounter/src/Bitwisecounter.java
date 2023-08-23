import java.util.Scanner;

public class Bitwisecounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=scan.nextInt();
		int ac=countSetBits(n);
		System.out.println("number of set bits: "+" "+ ac);

	}
	public static int countSetBits(int n) {
		int count = 0;
        while (n != 0) {
            count += n & 1; 
            n >>= 1;        
        }
        return count;
	}

}
