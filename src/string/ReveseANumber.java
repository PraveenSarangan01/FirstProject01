package string;

public class ReveseANumber {

	public static void main(String[] args) {
		int given=7158;
		int reverseNumber=0;
	
		while(given != 0) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber+given%10;
			given=given/10;
		}
		System.out.println(reverseNumber);
	}

}
