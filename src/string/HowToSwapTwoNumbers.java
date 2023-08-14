package string;

public class HowToSwapTwoNumbers {

	public static void main(String[] args) {
		withoutThirdVariable();
	}
	
		// TODO Auto-generated method stub
	static void withThirdVariable() {		
		int mysal=20000;
			int superior =50000;
			System.out.println("Before swapping"+"My salary ="+mysal);
			System.out.println("Before swapping"+"Superior salary ="+mysal);
			int temp = mysal;
			mysal=superior;
			superior=temp;
			System.out.println("After swapping"+"My salary ="+mysal);
			System.out.println("After swapping"+"Superior salary ="+mysal);
	}
	
	static void withoutThirdVariable() {
		int first =20000;
		int second =50000;
			
		first=first-second;//20000-50000=-30000
		second=first+second;//-300000+20000=20000
		first=second-first; //20000 -(-30000)
		
		System.out.println("First"+first);
		System.out.println("Second"+second);
		
	}
	
	
}
