/*Find maximum difference with input array as = [23,67,1,6,97,21,7]
*/
package Java;

public class MaxDiff {

	public static void  main(String[] args) {
		
		// TODO Auto-generated method stub
		int ar [] = {23,67,1,6,97,21,7};
		int result = FindDiff(ar);
		System.out.print(result);
	}
		
		public static int  FindDiff(int ar[]) {
		
			if(ar.length<2) {
				System.out.print("not adequate");
				return 0;
			}
		
		
		int mindiff = ar[0];
		int maxdiff = ar[1]-ar[0];
		
		
		
		for(int i = 1;i<ar.length;i++) {
			
			if(ar[i]-mindiff>maxdiff) {
				maxdiff = ar[i]-mindiff;
			}
			
			if(ar[i]<mindiff) {
				mindiff = ar[i];
			}
		}
		return maxdiff;
		}
		

	}


