package Java;

public class BubbleSort {

	public static void main(String[] args) {
		int ar [] = {2,4,5,6,7,8,9,4,1};
		BubbleSort(ar);
		Result(ar);
		

	}
	
	public static void BubbleSort(int ar[]) {
		int n = ar.length;
		for(int i =0;i<n-1;i++) {
			for(int j = 0;j<n-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					
							
				}
			}
		}
	}
	public static void Result(int ar[]) {
		for(int i =0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

}
