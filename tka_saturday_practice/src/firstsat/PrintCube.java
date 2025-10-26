package firstsat;

import java.util.Scanner;

public class PrintCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int a = sc.nextInt();
		System.out.println("Cube :"+a*a*a);
		sc.close();
	}
}
