package com.dherbet.codility.lesson1;

public class GKBinaryGap_2 {

    public int solution(int N){
        boolean oneFound = false;
        int binaryGap = 0; // Final result
        int sequenceGap = 0; // Temporary gap 
        String binaryString = Integer.toBinaryString(N);
        System.out.println();

        for (char num: binaryString.toCharArray()){
            // What happens when we hit 1s
            if (num == '1'){
                if (!oneFound){ // If the flag is lowered it means we are about to start measuring a sequence
                    oneFound = true;
                    sequenceGap = 0;
                } else { // If the flag was already raised
                    oneFound = false;
                    if (sequenceGap>binaryGap){
                        binaryGap = sequenceGap;
                    }
                }  
            } else { // What happens when we hit a zero 
                sequenceGap += 1; // Add one to the sequence gap 
            }
        }
        return binaryGap;
    } 

    public static void main(String[] args) {
        GKBinaryGap_2 myClass = new GKBinaryGap_2();
        int N = 20;
        System.out.println(myClass.solution(N));
    }
}
