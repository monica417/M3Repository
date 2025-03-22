package JavaPracticeCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_Number_Of_Punctions_In_Sentence {
	public static void main(String[] args) throws IOException {
		
		String str="";
		
		int punct=0;
		int letter=0;
		int spaces = 0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String:-");
		str=br.readLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='A'&&ch<='Z'||ch>='a'&& ch<='z') {
				
				letter++;
			}
			
			else if(ch==' '||ch=='\t') {
				spaces++;
			}
			else {
				punct++;
			}
		}
		System.out.println("Number Of Letters:" +letter);
		System.out.println("Number of spaces:" +spaces);
		System.out.println("Number of punct:"+ +punct);
			
		
	}
	

}
