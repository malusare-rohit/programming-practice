package firstsat;

import java.util.Scanner;

public class CelToFarh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature in celsius:");
		float celsius = sc.nextInt();
		float fahrenheit  = (celsius * 9/5) + 32;
		System.out.println("Fahrenheit :"+fahrenheit);
		sc.close();
	}
}
