package com.dherbet.codility.lesson2;

import java.util.Arrays;

public class GKCyclicRotation {
    public int[] solution(int[] A, int K) {

        // Make a result array which is the same as the input Array.
        int[] result = A.clone();

        System.out.println("My temp array has " + result.length + " elements");

        if (K!=0){
            // Do one rotation at a time: 
            for (int i = 1; i <= K; i++){
                result = rotateArrayOnce(result);
            }
        }
        return result;
    }

    // Helper function which performs one rotation to the array 
    private int[] rotateArrayOnce(int[] arrayToBeRotated){

        // Allocate memory for resulting array.
        int[] rotatedArray = new int[arrayToBeRotated.length];
        int nextPosition;

        // Go over each element in the array and shift it.
        for (int j =0; j<arrayToBeRotated.length; j++){

            // This is the position for the shifted elements. 
            nextPosition = j+1;
            
            // If element is in last position, wiht the shift it should go in [0] position.
            if(nextPosition == arrayToBeRotated.length){
                rotatedArray[0] = arrayToBeRotated[j];
            } else {
                rotatedArray[nextPosition] = arrayToBeRotated[j];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        GKCyclicRotation cyclicRotation = new GKCyclicRotation();
        int[] testArray = {1,2,3};
        int K = 4;
        int[] result = cyclicRotation.solution(testArray, K);
        System.out.println("Original array = " + Arrays.toString(testArray));
        System.out.println("Rotation (K) = " + K);
        System.out.println("Result = " + Arrays.toString(result));

    }
    
}
