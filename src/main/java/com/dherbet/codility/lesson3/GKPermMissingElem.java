package com.dherbet.codility.lesson3;

public class GKPermMissingElem {

    public int solution(int[] A){
        // My idea is that the sum of all elements in a complete array - the sum of elements in array as it is should result the missing element
        // We know that the array should be of length N+1 but because 1 is missing, the length is N. 
        // We know that the sum of N integers is N(N+1)/2. But now we have N+1 integers , so the sum is (N+1)(N+2)/2
        int theoreticalSum = ((A.length+1)*(2+ A.length))/2;

        int actualSum =0;

        // For the actual sum we simply add all numbers
        for(int i = 0 ; i < A.length; i++){
            actualSum = actualSum + A[i];
        }
        return theoreticalSum-actualSum;
    }
    
    public static void main(String[] args) {
        GKPermMissingElem myClass = new GKPermMissingElem();
        int[] A = {2,3,1,4,5,6,9,7};
        System.out.printf("The missing element is %d", myClass.solution(A));

    }
    
}
