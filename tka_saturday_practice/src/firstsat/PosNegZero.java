package firstsat;

import java.util.Scanner;

public class PosNegZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("positive");
		} else if(n<0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
		sc.close();
	}
}
