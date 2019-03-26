package com.algorithm.sorting;

public class QuickSort {
	
	public void sort(int[] numbers, int start, int end) {
		
		if (start < end) {
			int pivot = partition(numbers, start, end);
			sort(numbers, start, pivot-1);
			sort(numbers, pivot+1, end);
		}
	}
	
	private int partition(int[] numbers, int start, int end) {
		int pivot = end;	// 기준점
		int wall = start;	// 벽
		int left = start;	// 비교점
		
		
		while (left < pivot) {
			if (numbers[left] < numbers[pivot]) {
				swap(numbers, left, wall);
				wall += 1;
			}
	        left += 1;
		}
		swap(numbers, wall, pivot);
		pivot = wall;
		
		return pivot;
	}

	private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
}