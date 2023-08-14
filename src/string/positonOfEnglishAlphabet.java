package string;

import java.util.Scanner;

public class positonOfEnglishAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Character :");
		char givenChar = scanner.next().charAt(0);
		scanner.close();
		givenChar = Character.toLowerCase(givenChar);
		int asciiValue=(int)givenChar;
		System.out.println(asciiValue);
		int position = asciiValue-96; 
		System.out.println(position);
		
	}

}
