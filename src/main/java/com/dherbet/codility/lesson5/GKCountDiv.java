package com.dherbet.codility.lesson5;

public class GKCountDiv {

    public int solution(int A, int B, int K){
        // The idea here is to find the first integer that gets divided by K and then keep adding K to it untl you reach B.
        // The answer is 1 + the numbers we added K. 

        int nextInt = A;
        int numDivByK = 0;

        while(nextInt <= B){
            // Check if the remainder of A after division is 0
            if (nextInt % K == 0){
                // Increase the number of integers divided by K by 1
                numDivByK++;
                // Increase nextInt by K 
                nextInt += K;
            } else {
                // If nextInt is not divisible by K then simply increase nextInt by 1
                nextInt++;
            }
        }

        return numDivByK;
    }

    public static void main(String[] args) {
        GKCountDiv myClass = new GKCountDiv();
        int A = 6;
        int B = 11;
        int K = 2;
        System.out.println(myClass.solution(A, B, K));
    }


}
