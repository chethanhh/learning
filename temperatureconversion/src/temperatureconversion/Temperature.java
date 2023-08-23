package temperatureconversion;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner scan = new Scanner(System.in);
		System.out.println("select an option");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. convert Fahrenheit yo celcius");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("enter temperature in celcius");
			double celsius = scan.nextDouble();
			double fahrenheit = celsiusToFahrenheit(celsius);
			System.out.println("result " + " " + fahrenheit);
		} else if (choice == 2) {
			System.out.println("enter temperature in fahrenheit");
			double fahrenheit = scan.nextDouble();
			double celsius = fahrenheitToCelsius(fahrenheit);
			System.out.println("result " + " " + celsius);
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		double res = (celsius * 9 / 5) + 32;
		return res;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double res1 = (fahrenheit - 32) * 5 / 9;
		return res1;
	}
}
