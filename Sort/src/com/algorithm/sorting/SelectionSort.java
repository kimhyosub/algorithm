package com.algorithm.sorting;

public class SelectionSort {
	 
    public void sort(int[] numbers) {
    	int minimunVal;
    	int minimunPoint;
    	int n = numbers.length;
    	for (int i=0; i < n; i++) {
    		minimunVal = numbers[i];
    		minimunPoint = i;
			for(int j=0; j < n-i; j++) {
				if(numbers[j+i] < minimunVal) {
					minimunVal = numbers[j+i];
					minimunPoint = j+i;
				}
			}
			swap(numbers, i, minimunPoint);
		}
    }
    private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
}