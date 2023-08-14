package string;

public class RemoveLeadingAndTrailingWhiteSpaces {

	public static void main(String[] args) {
		String str =" Hello Praveen ";
		System.out.println(str.trim());
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		System.out.println(str.replaceAll("^[ \t]+|[ \t]+$", "" ));
		System.out.println(str.replaceAll("^[ \t]+", ""));
		System.out.println(str.replaceAll("[ \t]+$", ""));

	}

}
