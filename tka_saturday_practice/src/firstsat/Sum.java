package firstsat;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first No :");
		int a = sc.nextInt();
		System.out.print("Enter Second No :");
		int b = sc.nextInt();
		System.err.println(a+b);
		sc.close();
		}

}
