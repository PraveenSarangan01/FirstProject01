package string;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		String input ="PraveenKaumar";
		char toFind='a';
		int count =0;
		 
			input = input.toLowerCase();
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i)==toFind) {
					count++;
				}
			}
			System.out.println(count);
	}

}
