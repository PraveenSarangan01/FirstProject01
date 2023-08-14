package string;

public class ReplaceVowelsWithRegularExpressions {

	public static void main(String[] args) {
		String given = "I Love Mahendra singh Dhoni";
		
		String replacedString = given.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedString);

	}

}
