package firstsat;

import java.util.Scanner;

public class CheckVowelCons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character :");
		char c = sc.next().charAt(0);
		sc.close();
		if(Character.isLetter(c)) {
		if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'|c=='A'|c=='E'|c=='I'|c=='O'|c=='U') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonent");
		}
	
	}else {
		System.out.println("Enter a valid character...!");
	}
}
}
