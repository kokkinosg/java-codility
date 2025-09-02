package com.dherbet.codility.lesson5;

public class GKCountDiv2ndAtt {

    public int solution (int A, int B, int K){
        // We know that the number of integers divided by K from 0 to B is B/K. 
        // For example when B = 10 and K = 2, there are 5. 
        // When B = 11 and K=2, there are 5.20 which is always rounded down to 1. 
        // Similarly for A, the number of integers divided by K from 0 to A is is A/K. 
        // The final asnwer would be B/K - (A-1)/K, we do A-1 to allow B/K to capture A. 

        int divZeroToB = B/K;
        int divZeroToAMinus1 = (A-1)/K;

        return divZeroToB - divZeroToAMinus1;
    }

    public static void main(String[] args) {
        GKCountDiv2ndAtt myClass = new GKCountDiv2ndAtt();
        System.out.println(myClass.solution(4, 11, 2));
    }
    
}
