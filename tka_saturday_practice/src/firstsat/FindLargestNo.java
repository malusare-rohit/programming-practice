package firstsat;

import java.util.Scanner;

public class FindLargestNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Number :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.print("Largest No :");
		if(n1>n2 & n1>n3) {
			System.out.println(n1);
		}else if(n2>n1 & n2>n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}
		sc.close();

	}
}
