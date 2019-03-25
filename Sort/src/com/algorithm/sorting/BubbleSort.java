package com.algorithm.sorting;

public class BubbleSort {
	 
    public void sort(int[] numbers) {
    	int n = numbers.length;
    	for (int i : numbers) {
			for(int j=1; j < n; j++) {
    			if(numbers[j-1] > numbers[j]) {
    				swap(numbers, j-1, j);
    			}
    		}
		}
    }
 
    private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
}
