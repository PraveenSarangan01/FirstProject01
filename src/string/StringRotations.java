package string;

public class StringRotations {

	public static void main(String[] args) {
		String str1="hello";
		String str2="lohel";

		boolean isRotation = isRotation(str1,str2);
		if(isRotation) {
			System.out.println("Strings are rotation of each other");
		}
		else {
			System.out.println("strings are not Rotation");
		}
	}

	private static boolean isRotation(String str1, String str2) {
		if(str1.length()!=str2.length()) {
		return false;
	}
		String concatenadted=str1+str1;
		return concatenadted.contains(str2);
		
}
}