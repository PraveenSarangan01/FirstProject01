package string;

public class Palindrome {

	public static void main(String[] args) {
		String str="Madaz";
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		} 
		if(str.equals(reverse)) {
			System.out.println("Given word is Palindrome");
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
