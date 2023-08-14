package string;

public class GetNumericValueFromStringandAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Praveen123";
		int total=0;
		
		for(int i=0;i<input.length();i++) {
			char charAt = input.charAt(i);
			if(Character.isDigit(charAt)) {
				total += Character.getNumericValue(charAt);
			}
			
		}
		System.out.println(total);
				
	}

}
