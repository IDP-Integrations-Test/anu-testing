package Java;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "abc";
		String text2  ="bcau";
		
		if(isAnagram(text,text2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}
		
		public static boolean isAnagram(String text,String text2) {
			
			
			if(text.length() != text2.length()) {
				return false;
			}
			int countarr [ ] = new int [256];
			
			for(int i =0 ;i<text.length();i++) {
				countarr[text.charAt(i)]++;
				countarr[text2.charAt(i)]--;
				
			}
			
			for(int j =0 ; j <countarr.length;j++) {
				if(countarr[j]!=0) {
					return false;
				}
			}
				return true;
			}
		



}



