package string;

public class CountVowelsAndConstant {

	public static void main(String[] args) {
		String str = "Praveen";
		int vowelscount=0;
		int consonants =0;
		
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelscount++;
				
			}
			else {
				consonants++;
			}
		}
		System.out.println("Vowels count is :"+vowelscount);
		System.out.println("Consonants count is :"+consonants);
		

	}

}
