package Sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
	
	int[] nums;
	int[] toCompare;

	@BeforeEach
	public void setUp() throws Exception {
		this.nums = new int[10];
		this.toCompare = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			this.nums[i] = rand.nextInt(1000);
			this.toCompare[i] = this.nums[i];
		}
		InsertionSort.sort(this.nums);
	}

	@Test
	public void testEqualLength() {
		assertEquals(this.nums.length, this.toCompare.length);
	}
	
	@Test
	public void testIsOrderCorrect() {
		Arrays.sort(this.toCompare);
		for (int i = 0; i < 10; i++) {
			assertEquals(this.nums[i], this.toCompare[i]);
		}
	}

}
