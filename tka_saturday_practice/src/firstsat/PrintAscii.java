package firstsat;

import java.util.Scanner;

public class PrintAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		char c = sc.next().charAt(0);
		System.out.println((int)c);
		sc.close();
	}
}
