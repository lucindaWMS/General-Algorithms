package Sorting;
/**
 * Idea:
 * 		given an array with size of N, loop N-1 times
 * 		in each loop, we assume the first i elements are already in order
 * 		we insert a[i] to the appropriate position
 * Complexity:
 * 		best case: the array is in the order we want initially, we need to do N-1 compare operations
 * 				   the complexity is O(N)
 * 		worst case: the array is in the reverse order we want initially, we need to do N(N-1)/2 compare operations
 * 					the complexity is O(N^2)
 * 		average complexity: O(N^2)
 * it's a stable sorting algorithm
 * @author wenmusha
 *
 */
public class InsertionSort {
	public static int[] sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int val = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > val) {
				nums[j+1] = nums[j];
				j -= 1;
			}
			nums[j+1] = val;
		}
		return nums;
	}

}
