package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {
public static void main(String[] args) {
	String str= "programming";
	char[] ch = str.toCharArray();
	StringBuilder sb= new StringBuilder();
	for(int i=0;i<ch.length;i++) {
		boolean repeated =false;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				repeated =true;
				break;
			} 
		}
		if(!repeated) {
			sb.append(ch[i]);
		}
	}
	System.out.println(sb);
	
	StringBuffer sb2=new StringBuffer();
	for(int i=0;i<str.length();i++) {
		char charAt = str.charAt(i);
		int indexOf = str.indexOf(charAt, i+1);
		if(indexOf==-1) {
			sb2.append(charAt);
		}
	}
	System.out.println(sb2);
	
	char[] charArray = str.toCharArray();
	Set<Character> ts = new LinkedHashSet<>();
	for(Character charact : charArray) {
		ts.add(charact);
	}
	System.out.println(ts);
}
}
