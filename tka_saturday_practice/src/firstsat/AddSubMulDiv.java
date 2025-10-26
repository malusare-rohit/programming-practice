package firstsat;

import java.util.Scanner;

public class AddSubMulDiv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first No :");
		int a = sc.nextInt();
		System.out.print("Enter Second No :");
		int b = sc.nextInt();
		System.out.println("Addition :"+(a+b));
		System.out.println("Substraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(a/b));
		sc.close();
	}

}
