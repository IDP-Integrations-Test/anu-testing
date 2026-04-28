//1 1 2 3 5 8 
package Java;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,sum=0,fibsum=0;
		for(int t =1;t<=8;t++) {
			fibsum += n1;
			sum = n1+n2;
			n1=n2;
			n2=sum;
			
			
		}
		
		System.out.println(fibsum);
		
	}

}
