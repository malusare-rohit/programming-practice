package firstsat;

import java.util.Scanner;

public class avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first No :");
		int a = sc.nextInt();
		System.out.print("Enter Second No :");
		int b = sc.nextInt();
		System.out.print("Enter Second No :");
		int c = sc.nextInt();
		System.out.println((a+b+c)/3);
		sc.close();
	}
}
