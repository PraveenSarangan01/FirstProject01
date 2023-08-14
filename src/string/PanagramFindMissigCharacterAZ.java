package string;

import java.util.Arrays;
import java.util.HashSet;

public class PanagramFindMissigCharacterAZ {

	public static void main(String[] args) {
		String input="ab";
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		String[] given = input.split("");
		String[] alphabet = alphabets.split("");
		 
		HashSet<String> set1=new HashSet<>(Arrays.asList(given));
		HashSet<String> set2=new HashSet<>(Arrays.asList(alphabet));
		set2.removeAll(set1);
		System.out.println(set2);

		
	}

}
