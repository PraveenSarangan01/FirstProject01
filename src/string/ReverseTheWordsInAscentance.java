package string;

public class ReverseTheWordsInAscentance {

	public static void main(String[] args) {
		String given= "i love india";
		String reverse ="";
		
		String[] temp = given.split(" ");
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		for(int i=temp.length-1;i>=0;i--) {
			reverse+=temp[i]+" ";
			
		}
		System.out.println("Reversed String is :"+reverse);
	}

}
