package JavaPracticeCode;

import java.util.Scanner;

public class CharOccuredInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:-");
		String str=sc.nextLine();
		
		System.out.println("Enter Char:");
		char ch=sc.next(".").charAt(0);
		
		int count=0;
		char starr[]=str.toCharArray();
		for(int i=0; i<str.length();i++) {
			if(starr[i]==ch) {
				count++;
			}
		}
		System.out.println(count + " times " + ch + " Occur in the sentence.");
	}

}
