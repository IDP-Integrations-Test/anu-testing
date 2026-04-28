package Java;

public class Max_Min_Array {

	public static void main(String[] args) {
		int ar[] = {6,2,3,4,3,78,5,799,9,1};
		int min = ar[0];
		
		for(int i =1;i<ar.length;i++) {
			if(ar[i]>min) {
				min= ar[i];
				
				
			}
		}
		System.out.println(min);
		

	}

}
