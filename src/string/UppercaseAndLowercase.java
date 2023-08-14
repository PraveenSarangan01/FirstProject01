package string;

public class UppercaseAndLowercase {

	public static void main(String[] args) {
		String input="Hello, I am Praveen";
		char[] charArray = input.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]>=97 && charArray[i]<=122) {
				charArray[i]=(char) (charArray[i]-32);
			}
		}
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}
	}

}
