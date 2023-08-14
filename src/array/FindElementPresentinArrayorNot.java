package array;

public class FindElementPresentinArrayorNot {

	
		int[] array = {1,2,3,4,5,6};
		int numberToFind=13;
		
		boolean found=false;
		
		public void presntOrNot() {
		for(int i=0;i<array.length;i++) {
			if(array[i]==numberToFind) {
				found=true;
				break;
			
			}
		}
		if(found) {
			System.out.println("Number is present in Array");
		}
		else {
			System.out.println("Number is not Present");
		}
		}
		public static void main(String[] args) {
			FindElementPresentinArrayorNot ele = new FindElementPresentinArrayorNot();
			ele.presntOrNot();
		}
	

}
