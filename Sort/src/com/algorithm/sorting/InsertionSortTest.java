package com.algorithm.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {

	private BubbleSort sorter = new BubbleSort();
	 
    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
 
        sorter.sort(values);
    }
 
    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};
 
        sorter.sort(values);
 
        assertArrayEquals(new int[] {42}, values);
    }
 
    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1, 12, 6};
        int[] expectedOrder = { -3, 0, 1, 5, 6, 9, 12};
 
        sorter.sort(values);
        
        assertArrayEquals(expectedOrder, values);
    }
}
