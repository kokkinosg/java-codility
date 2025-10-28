package com.dherbet.codility.lesson3;

public class GKTapeEquilibrium_2 {

    public int solution(int[] A){

        int[] prefixSum = new int[A.length];

        // Compute prefix sums for A
        for (int i =0; i < A.length; i++){ 
            if(i ==0){
                prefixSum[i]= A[i];
            } else {
                prefixSum[i]= A[i] + prefixSum[i-1];
            } 
        }
        int currDifference; // Difference for a specific P
        int minDifference = Integer.MAX_VALUE; // Declare and initialise the minDifference tracker which will be returned. 
        int possSplits = A.length - 1; // The number of possible splits 

        // Loop through the prefix sums array checking out all possible splits. 
        // when i = 0 this means P = 1
        //     1,2,3,4,5,6
        //     pfsums = 1,3,6,10,15,21

        //     left = 1
        //     right = last eleemnt of pfsum  - left = 21 - left
        for (int i =0; i < possSplits; i++){
            int leftSum = prefixSum[i]; // Left side Sum
            int rightSum = prefixSum[prefixSum.length-1] - leftSum; // last eleemnt of prefixsum  - leftSum
            currDifference = Math.abs(leftSum-rightSum);
            if (currDifference < minDifference){
                minDifference = currDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        GKTapeEquilibrium_2 myClass = new GKTapeEquilibrium_2();
        int[] A = {3,1,2,4,3};
        System.out.println(myClass.solution(A));
    }
    
}
