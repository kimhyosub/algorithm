package com.algorithm.sorting;

public class MergeSort {
	
	public void sort(int[] numbers) {
	    
	    if(numbers.length > 1) {
	    	int arrLength = numbers.length;
	    	
	    	int[] leftArr = new int[arrLength/2];
	    	System.arraycopy(numbers, 0, leftArr, 0, leftArr.length);
	    	
	    	int[] rightArr = new int[arrLength - arrLength/2];
	    	System.arraycopy(numbers, leftArr.length, rightArr, 0, rightArr.length);
	    	
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
}