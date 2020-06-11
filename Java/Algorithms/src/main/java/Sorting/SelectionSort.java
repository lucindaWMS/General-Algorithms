package Sorting;
/**
 * Idea: in an array which is size of N, loop N-1 times
 * 		 in each loop, select the smallest or largest element, and put it at the beginning of the array
 * Complexity:
 * 		 0 ~ N-1 switch operations
 * 		 N(N-1)/2 compare operations
 * 		 0 ~ 3(N-1) assignment operations
 * 		 since the number of compare operation is irrelevant to the initial status of the array
 * 		 Best: O(N^2)
 * 		 Worst: O(N^2)
 * It's unstable. E.g. we have an array: 5, 4, 5, 2, 9
 * 		 if we use selection sort, in the first round, we will switch the first 5 and 2; 
 * 		 then, in the rest rounds, the order of the 5s are broken
 *		 therefore, the selection sort is regarded as an unstable sort algorithm
 * @author wenmusha
 *
 */

public class SelectionSort {
	
	public static int[] sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
			}
		}
		return nums;
	}
}
