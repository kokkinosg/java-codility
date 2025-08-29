package com.dherbet.codility.lesson3;
import java.util.ArrayList;

public class GKTapeEquilibrium {

    public int solution(int[] A){
        // The result to returned.
        int minimalDifference = 1000000;

        // Get the length of the array 
        int N = A.length;

        // Find the prefixSums of A
        ArrayList<Integer> prefixSums = new ArrayList<>();

        // Add the first element of A into prefix Sums
        prefixSums.add(A[0]);

        // Find the prefix sums arrayList of A
        for(int i = 1 ; i < N; i++){
            //Previus Sum
            int prevSum = prefixSums.get(i-1);
            prefixSums.add(prevSum + A[i]);
        }

        // I have to find the minimuml difference by going over all possible values of P such that 0<P<N
        for(int P = 1; P < N; P++){
            // Calculate the sum of the first part of the split A. This is essentially the P-1 eleemnt of the prefixSums
            int firstPartSum = prefixSums.get(P-1);

            // The second part is esentially the last element of prefix sums - the first part 
            int secondPartSum = prefixSums.get(prefixSums.size() - 1) - firstPartSum;

            // Calculate the absolute of their difference
            int difference = Math.abs(firstPartSum-secondPartSum);

            // find the minimal difference
            if(difference < minimalDifference){
                minimalDifference = difference;
            }
        }

        return minimalDifference;
    }

    public static void main(String[] args) {
        GKTapeEquilibrium myClass = new GKTapeEquilibrium();
        int[] A = {3,1,2,1,3};
        int minimalDifferenceAnswer = myClass.solution(A);
        System.out.printf("Minimal difference = %d",minimalDifferenceAnswer);
        
    }
    
}
