package firstsat;

import java.util.Scanner;

public class FindProfitLoss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Selling Price:");
		int sp = sc.nextInt();
		System.out.print("Enter Cose Price :");
		int cp = sc.nextInt();
		long profit = sp-cp;
		long loss = cp-sp;
		
		if(profit>loss) {
			System.out.println("profit");
		}else if(profit==loss){
			System.out.println("No profit No lose");
		}else {
			System.out.println("loss");
		}
	sc.close();	
	}

}
