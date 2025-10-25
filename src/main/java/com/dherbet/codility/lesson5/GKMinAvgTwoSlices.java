package com.dherbet.codility.lesson5;

public class GKMinAvgTwoSlices {
    
    public int solution(int[] A){

        // Assign the max values to P and Avg of slice
        int minimumP = Integer.MAX_VALUE;
        double minimumAvg = Double.MAX_VALUE;

        // Compute prefix sums of A
        int[] F = computePrefixSums(A);

        // Go over all possible values of P
        for (int P =0; P < F.length; P++){
            // Go over all possible values of Q starting 1 more than P, to avoid Q <= P
            for (int Q = P+1; Q < F.length; Q++){
                // Compute the average of the slice
                double avg = computeAvgSlice(P, Q, F, A);
                // Compute the minimum 
                if(avg<minimumAvg){
                    minimumAvg = avg;
                    minimumP = P;
                }
            }
        }
        return minimumP;
    }

    private int[] computePrefixSums(int[] A){
        // Compute the prefix sums (F) of A

        // Create an empty array F of as many elements as A
        int[] F = new int[A.length];

        // Populate F
        for(int i = 0; i<A.length; i++){
            // only for the first element, it is the same as A[i]
            if (i == 0){
                F[i] = A[i];
            } else {
                F[i] = F[i-1]+A[i];
            }
            
        }

        return F;
    }
    
    private double computeAvgSlice(int P, int Q, int[] F, int[] A){
        
        double avg = (double) (A[P]+(F[Q] - F[P]))/((Q-P)+1);

        return avg;
    }

    public static void main(String[] args) {
        GKMinAvgTwoSlices myClass = new GKMinAvgTwoSlices();
        int[] A = {4,2,2,5,1,5,8};

        System.out.println(myClass.solution(A));
    }



}
