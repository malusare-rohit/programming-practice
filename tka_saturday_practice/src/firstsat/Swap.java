package firstsat;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number :");
		int  a = sc.nextInt();
		System.out.print("Enter second Number :");
		int  b = sc.nextInt();
		System.out.println("Before Swap :"+"a="+a+" "+"b ="+b);
		 a = a+b;
		 b = a-b;
		 a = a-b;
		System.out.print("After Swap :"+"a="+a+" "+"b ="+b);
		sc.close();
		}

}

