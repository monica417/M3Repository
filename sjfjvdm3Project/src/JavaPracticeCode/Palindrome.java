package JavaPracticeCode;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String original=scanner.nextLine();
		String reverse="";
	
		for(int i=original.length()-1; i>=0;--i) {
			
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("String is Palindrome");
		}
		else {
			
			System.out.println("String is not Palindrome");
		}
	}

}
