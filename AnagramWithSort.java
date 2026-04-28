package Java;

import java.util.Arrays;

public class AnagramWithSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "hello";
		String text2 = "ollhe";
		
		
		char [] ar = text.toCharArray();
		char [] arr = text2.toCharArray();
		
		Arrays.sort(ar);
		Arrays.sort(arr);
		
		String sorted1 = new String(arr);
		String sorted2 = new String(ar);
		
		if(sorted1.equals(sorted2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}

}
