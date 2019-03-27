package com.algorithm.sorting;

import java.util.Arrays;

public class HeapSort {
	
	public void sort(int[] values) {
		int size = values.length;
		System.out.println("============================================");
		System.out.println("Before Heapify : " + Arrays.toString(values));
		heapify(values, size);
		System.out.println("After Heapify : " + Arrays.toString(values));
		System.out.println("============================================");
		int end = size -1;
		while(end > 0) {
			System.out.println("============================================");
			System.out.println("Before Swap : " + Arrays.toString(values));
			swap(values, 0, end);
			System.out.println("After Swap : " + Arrays.toString(values));
			System.out.println("============================================");
			siftdown(values, 0, end);
			end -= 1;
		}
		System.out.println(Arrays.toString(values));
	}
	
	private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
	
	private void siftdown(int[] values, int index, int size) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int largest = index;
		
		if(left <= size-1 && values[left] > values[index]) {
			largest = 1;
		}
		
		if(right <= size-1 && values[right] > values[largest]) {
			largest = right;
		}
		
		if(largest != index) {
			swap(values, index, largest);
			siftdown(values, largest, size);
		}
	}
	
	private void heapify(int[] values, int size) {
		int point = (size/2) -1;
		while(point >= 0) {
			siftdown(values, point, size);
			point -= 1;
		}
	}
	
}
