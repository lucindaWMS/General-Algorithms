package Sorting;
/**
 * Idea:
 * 		in an array which is size of N, loop N-1 times, 
 * 		in each loop, we compare the two adjacent element (e.g. a[i] and a[i+1]) and switch them according to the order we want
 * 		then, in each loop, what we actually did is pick out the largest or smallest number and put it at the end of the array
 * Complexity:
 * 		N-1 ~ N(N-1)/2 compare operations
 * 		0 ~ 3N(N-1)/2 assignment operations
 * 		the best case: the array is in the order we want initially, then the time complexity is O(N)
 * 		the worst case: the array is in the reverse order we want initially, then the time complexity is O(N^2)
 * 		average time complexity: O(N^2)
 * It's stable:
 * 		since in each compare operation, we only compare the two adjacent elements and switch them if they're not equal
 * 		therefore, when the two adjacent elements are equal, we won't execute switch operation, and the initial order of two equal elements won't be broken
 * 		this makes bubble sort to be a stable sorting algorithm
 * @author wenmusha
 *
 */
public class BubbleSort {

		public static int[] sort(int[] nums) {
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = 0; j < nums.length - 1 - i; j++) {
					if (nums[j] > nums[j+1]) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
				}
			}
			return nums;
		}
}
