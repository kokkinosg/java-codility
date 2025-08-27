package com.dherbet.codility.lesson2;

import java.util.Arrays;

public class GKCyclicRotation2ndAtt {
    public int[] solution(int[] A, int K) {

        // Clone the array to a local array which will be passed as arguments
        int[] rotatedArray = A.clone();

        // DO the rotations only when K is more than 1
        if(K > 0){

            for(int i = 0; i < K; i++){
                rotatedArray = rotateArrayOnce(rotatedArray);
            }
        }

        return rotatedArray;
    }

    private int[] rotateArrayOnce(int[] A){

        // Create an empty array which is the same size as the input array
        int[] rotatedOnceArray = new int[A.length]; 

        for(int i = 0; i < A.length; i++){
            // Check if i points to the last element
            if(i == A.length -1){
                // Make the last element A the first element of i
                rotatedOnceArray[0] = A[i];
            } else {
                // for all other elements simply push them one to the right 
                rotatedOnceArray[i+1] = A[i];
            }
        }
        return rotatedOnceArray;
    }

       
    public static void main(String[] args) {
        GKCyclicRotation2ndAtt cyclicRotation = new GKCyclicRotation2ndAtt();
        int[] testArray = {1,2,3};
        int K = 4;
        int[] result = cyclicRotation.solution(testArray, K);
        System.out.println("Original array = " + Arrays.toString(testArray));
        System.out.println("Rotation (K) = " + K);
        System.out.println("Result = " + Arrays.toString(result));

    }
    
}
