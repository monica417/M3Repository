package JavaPracticeCode;

public class AsciitocharAndCharToAscii {

	public static void main(String[] args) {
		char a='a';
		int i=65;
		System.out.println(CharToAscii(a));
		System.out.println(AsciiToChar(i));
		
		
		}

public static char AsciiToChar(int ascii){
		
		return(char) ascii;

}
	

	public static int CharToAscii(char character){
		
		return(int) character;

}
}
