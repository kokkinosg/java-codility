package com.dherbet.codility.lesson5;

public class GKPassingCars {
    // The idea here is that we need to count the numbers of 1s after every 0. 
    // For example A = {0,1,0,1,1} this means that after the first 0 there are 3 x 1s and after the second 0 there are 2 x 1s which makes it 5 possible pairs. 
    // So i need to have 2 counters. One for 0s and the other for pairs.
    // Every time I see a 0, i increase the 0 counter by 1 and every time I see 1 i add the current 0 counter to the pair counter
    

    public int solution(int[] A){

        // Initialise 0 counter and pair counter
        int zeroCount = 0;
        int pairsCount = 0;

        for(int i = 0; i <A.length; i++){
            if(A[i] == 0){
                zeroCount++;
            } else {
                pairsCount += zeroCount;
            }
        }

        if (pairsCount >= 1000000000){
            return -1;
        } 
        return pairsCount;
    }

    public static void main(String[] args) {
        GKPassingCars myClass = new GKPassingCars();
        int[] A = {0,1,0,1,1};
        System.out.println(myClass.solution(A));
    }


}
