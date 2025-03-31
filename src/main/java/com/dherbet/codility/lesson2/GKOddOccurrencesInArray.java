package com.dherbet.codility.lesson2;

import java.util.Arrays;

public class GKOddOccurrencesInArray {

	public int solution(int[] A) {

		// Get the length of the array.
		int arrLength = A.length;
		// Flag to signal all elements have been checked.
		boolean checkAllElements = false; 

		// Iterator
		int i = 0;

		//Sort the array in ascending order. Remember that 
		Arrays.sort(A);

		System.out.println(Arrays.toString(A));

		while (!checkAllElements) { 
			// CHeck if the consecutive elements are the same 
			if(A[i] == A[i+1]){
				// Increase i by 2 so that you check the third element in line
				i = i + 2;
			} else {
				// break the loop if A[i] != A[i+1]
				checkAllElements = true;
			}
		}
		// In a sorted array when there is only 1 unique number and all numbers can be paired, then it is always A[i] between A[i] and A[i+1]
		return A[i];
	}

	public static void main(String[] args) {
		GKOddOccurrencesInArray oddOccurrencesInArray = new GKOddOccurrencesInArray();
		int[] arr = {1,11,3,1,11,7,3};
		int A = oddOccurrencesInArray.solution(arr);
		System.out.println(A);
	}

}