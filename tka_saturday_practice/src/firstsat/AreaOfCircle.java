package firstsat;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius Of Circle :");
		int r = sc.nextInt();
		System.out.println("Area Of Circle :"+Math.PI*r*r);
		sc.close();
}
}
