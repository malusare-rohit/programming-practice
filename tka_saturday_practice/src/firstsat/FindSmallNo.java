package firstsat;

import java.util.Scanner;

public class FindSmallNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two Number :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print("Smallest No :");
		if(n1<n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		}
		sc.close();
	}
}
