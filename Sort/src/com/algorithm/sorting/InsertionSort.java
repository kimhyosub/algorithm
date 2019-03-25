package com.algorithm.sorting;

public class InsertionSort {

	public void sort(int[] numbers) {
		int n = numbers.length;
    	for(int i=0; i< n; i++) {
    		int standard = numbers[i];  // ����
			int aux = i - 1;   // ���� ���
			
			while (aux >= 0 && standard < numbers[aux]) {
				numbers[aux + 1] = numbers[aux];   // �񱳴���� ū ��� ���������� �о
				aux--;
			}
			numbers[aux + 1] = standard;  // ���ذ� ����
    	}
    }
}
