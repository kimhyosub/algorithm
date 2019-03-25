package com.algorithm.sorting;

public class InsertionSort {

	public void sort(int[] numbers) {
		int n = numbers.length;
    	for(int i=0; i< n; i++) {
    		int standard = numbers[i];  // 기준
			int aux = i - 1;   // 비교할 대상
			
			while (aux >= 0 && standard < numbers[aux]) {
				numbers[aux + 1] = numbers[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				aux--;
			}
			numbers[aux + 1] = standard;  // 기준값 저장
    	}
    }
}
