package com.algorithm.sorting;

import org.junit.Test;
 
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
 
public class QuickSortTest {
 
    private QuickSort sorter = new QuickSort();
 
    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};
 
        sorter.sort(values, 0, values.length-1);
    }
 
    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};
 
        sorter.sort(values, 0, values.length-1);
 
        assertArrayEquals(new int[] {42}, values);
    }
 
    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1, 12, 6, 8, 7, 16, 22, 4};
        int[] expectedOrder = { -3, 0, 1, 4, 5, 6, 7, 8, 9, 12, 16, 22 };
 
        sorter.sort(values, 0, values.length-1);
        
        assertArrayEquals(expectedOrder, values);
    }
}
