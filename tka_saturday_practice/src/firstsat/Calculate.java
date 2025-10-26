package firstsat;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of Five Subjects out of 100 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int total = a+b+c+d+e;
		System.out.println("Total :"+total);
		System.out.println("Average :"+(total/5));
		System.out.println("Percentage :"+((total/500)*100));
		sc.close();
	}
}
