package com.dherbet.codility.lesson1;

public class GKBinaryGap {

    public int solution(int N){

        // This is a flag which gets raised when one is found in the string
        boolean oneFound = false;
        // Initialise binary Gap with 0.
        int binaryGap = 0;
        // This is any gap, it may not be the largest
        int sequenceGap = 0;

        int binaryLength;

        // Print the input number
        System.out.println("N = "+ N);

        // Convert N to its binary representation . Note, that toBinaryString is a static methoid in the Integer class
        // String is an array of characters
        String binaryN = Integer.toBinaryString(N);

        // Print the string
        System.out.println(binaryN);

        // Identify the length of the binary number
        binaryLength = binaryN.length();

        // Go over each character in the string and check if it is one
        for (int i = 0; i < binaryLength; i++){

            // If 1 is found
            if(binaryN.charAt(i)=='1'){
                
                // If the flag is lowered, raise it.
                if(!oneFound){
                    oneFound = true;
                    // reset the sequence gap
                    sequenceGap = 0;        
                } // If already one 1 has been found and this is the second pair
                else {
                    if(sequenceGap>binaryGap){
                        binaryGap = sequenceGap;
                    }
                    // reset the sequence gap
                    sequenceGap = 0;
                }       
            } else {
                if (oneFound){
                    sequenceGap += 1;
                }
            }
        }

        // The idea is to find gaps between non concecutives integers
        System.out.println(binaryGap);
        return binaryGap;
        
    }

    // Test the code locally. 
    public static void main(String[] args) {
        GKBinaryGap binaryGap = new GKBinaryGap();
        binaryGap.solution(529);
        
    }
    
}



