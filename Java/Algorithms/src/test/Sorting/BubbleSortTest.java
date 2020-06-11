package Sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
	
	int[] nums;
	int[] toCompare;

	@BeforeEach
	public void setUp() throws Exception {
		Random rand = new Random();
		this.nums = new int[10];
		this.toCompare = new int[10];
		for (int i = 0; i < 10; i++) {
			this.nums[i] = rand.nextInt(1000);
			this.toCompare[i] = this.nums[i];
		}
		BubbleSort.sort(this.nums);
	}

	@Test
	public void testEqualLength() {
		assertEquals(nums.length, toCompare.length);
	}
	
	@Test
	public void testIsOrderCorrect() {
		Arrays.sort(toCompare);
		for (int i = 0; i < 10; i++) {
			assertEquals(nums[i], toCompare[i]);
		}
	}
}
