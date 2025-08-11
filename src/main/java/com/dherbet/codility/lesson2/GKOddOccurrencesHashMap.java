package com.dherbet.codility.lesson2;

import java.util.HashMap;

public class GKOddOccurrencesHashMap{

	public int solution(int[] A) {

		// Create a hashmap <Number, timesOccured>
		HashMap<Integer, Integer> elements = new HashMap<>();
	

		// Go over each element in array A
		for (int i = 0; i < A.length; i++){
			if(elements.containsKey(A[i])){
				elements.remove(A[i]);
			} else {
				elements.put(A[i], i);
			}
		}
		// My hashmap will only have 1 value. so get it . 
		return elements.keySet().iterator().next();
	}

	public static void main(String[] args) {
		GKOddOccurrencesHashMap oddOccurrencesHashMap = new GKOddOccurrencesHashMap();
		int[] arr = {1,11,9,3,1,11,7,3,7,8};
		int A = oddOccurrencesHashMap.solution(arr);
		System.out.println(A);
	}

}