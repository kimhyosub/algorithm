package com.algorithm.sorting;

public class MergeSort {
	
	public void sort(int[] numbers) {
	    
	    if(numbers.length > 1) {
	    	int arrLength = numbers.length;
	    	
	    	// 배열을 절반으로 쪼개서 복사
	    	int[] leftArr = new int[arrLength/2];
	    	copyArr(numbers, leftArr, 0, leftArr.length);
	    	
	    	int[] rightArr = new int[arrLength - arrLength/2];
	    	copyArr(numbers, rightArr, leftArr.length, rightArr.length);
	    	
	    	sort(leftArr);
	    	sort(rightArr);
	    	
	    	int i=0;
	    	int j=0;
	    	int k=0;
	    	
	    	while(i < leftArr.length && j < rightArr.length) {
	    		if(leftArr[i] < rightArr[j]) {
	    			numbers[k] = leftArr[i];
	    			i+=1;
	    		} else {
	    			numbers[k] = rightArr[j];
	    			j+=1;
	    		}
	    		k+=1;
	    	}
	    	
	    	while(i < leftArr.length ) {
	    		numbers[k] = leftArr[i];
	    		i+=1;
	    		k+=1;
	    	}
	    	
	    	while(j < rightArr.length ) {
	    		numbers[k] = rightArr[j];
	    		j+=1;
	    		k+=1;
	    	}
	    }
	}
	
	// 배열 복사
	public void copyArr(int[] oriArr, int[] defArr, int start, int end) {
		
		for(int i = 0 ; i < end ; i++){ 
			defArr[i] = oriArr[i+start]; 
		}
	}
	
	
}