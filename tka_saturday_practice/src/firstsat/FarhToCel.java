package firstsat;

import java.util.Scanner;

public class FarhToCel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature in fahrenheit:");
		float fahrenheit = sc.nextInt();
		float celsius  = (fahrenheit-32)*5/9;
		System.out.println("Celsius :"+celsius);
		sc.close();
	}
}
