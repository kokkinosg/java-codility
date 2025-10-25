package com.dherbet.codility.lesson2;

import java.util.Arrays;

public class GKCyclicRotation_3 {

    public int[] solution(int[] A, int K){
        // We dont care about full rotations only what is left
        int moveEachElemBy = K % A.length;
        int[] cloneA = A.clone();

        for(int i = 1; i <= moveEachElemBy; i++){ // Execute the rotateOnce function as many times as the rotations.
            cloneA = rotateOnce(cloneA);
        }
        return cloneA;
    }
        


    private int[] rotateOnce(int[] A){
        int[] rotA = new int[A.length];
        for (int i = 0; i <A.length; i++ ){
            if(i == A.length-1){ // If it points to the last element, make that element 1st in the array
                rotA[0] = A[i];
            } else { // For all else simply add 1 to their index
                rotA[i+1] = A[i];
            }

        }
        return rotA;


    }

    public static void main(String[] args) {
        GKCyclicRotation_3 myClass = new GKCyclicRotation_3();
        int[] A = {1,2,3,4};
        int K = 4;
        int[] sol = myClass.solution(A, K);
        System.out.println("Original array = " + Arrays.toString(A));
        System.out.println("Rotation (K) = " + K);
        System.out.println("Result = " + Arrays.toString(sol));
    }

    
    
}
