package Sorting;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sorting.SelectionSort;

public class SelectionSortTest {
	
	int[] nums;
	int[] toCompare;
	Random rand;

	@BeforeEach
	public void setUp() throws Exception {
		Random rand = new Random();
		this.nums = new int[10];
		this.toCompare = new int[10];
		for (int i = 0; i < 10; i++) {
			this.nums[i] = rand.nextInt(1000);
			this.toCompare[i] = nums[i];
		}
		SelectionSort.sort(this.nums);
	}

	@Test
	public void testEuqalLength() {
		assertEquals(nums.length, toCompare.length);
	}
	
	@Test
	public void testIsOrderCorrect() {
		Arrays.sort(this.toCompare);
		for (int i = 0; i < 10; i++) {
			assertEquals(nums[i], toCompare[i]);
		}
	}
}
