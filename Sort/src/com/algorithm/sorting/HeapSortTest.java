package com.algorithm.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
	HeapSort sorter = new HeapSort();
	
	@Test
	public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
 
        sorter.sort(values);
    }
	
	@Test
	public void shouldDoNothingWithOneElementArray() {
		int [] values = {11};
		
		sorter.sort(values);
		
		assertArrayEquals(new int[] {11}, values);
	}
	
	@Test
	public void shouldSortValues() {
		int[] values = { 9, -3, 5, 12, 1, 6 , 8};
        int[] expectedOrder = { -3, 1, 5, 6, 8, 9, 12};
 
        sorter.sort(values);
        
        assertArrayEquals(expectedOrder, values);
	}
	
}
