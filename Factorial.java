package Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fac =1;
		for(int i =1;i<=n;i++) {
			fac =fac*i;
		}
		System.out.println(fac);
	}

}
