/*
 * Given an array of integers, write a function to move all the negative numbers to the left end of the array without changing the relative order of the non-negative numbers. The function should do this in place with a minimum number of operations.
Example:
int[] nums = {1, -1, 3, -2, -3, 5, 6, -7}
Output: [-1, -2, -3, -7, 1, 3, 5, 6]
 */


package Java;

import java.util.Arrays;

public class moveInArrToSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};
		moveAllNegativeToleft(nums);
		System.out.println(Arrays.toString(nums));
	}
		public static void moveAllNegativeToleft(int[]nums) {
			
			int n = nums.length;
			int result[] = new int[n];
			int index=0;
			
			for(int i =0;i<n;i++) {
				if(nums[i]<0) {
					result[index++] = nums[i];
				}
			}
			for(int i = 0;i<n;i++) {
				if(nums[i]>=0) {
					result[index++] = nums[i];
				}
			}
			System.arraycopy(result,0, nums, 0,  n);
			
		}
		
		

}

