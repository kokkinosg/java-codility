package com.dherbet.codility.lesson4;
import java.util.HashMap;

public class GKFrogRiverOne {

    public int solution(int X, int[] A){
        // Essentially I need to find when all integers from 1 to X are shown at least once in array A

        // Create a Hashmap of Leave Number and whether it fell or not
        HashMap<Integer, Boolean> leaves = new HashMap<>();

        // Add all elements from 1 to X to the HashMap and have seen status as false
        for (int j = 1 ; j <= X ; j++){
            leaves.put(j, false);
        }

        // Now we have a hash map of all possible leave integers and their seen status is false.
        // In order for from to be able to jump and find the soonest he can jump all status need to be true.
        // Go over each element in A and change the status 
        // Initiliase a seconds counter. The counter is -1 because the first leave falls on count 0
        int secondsCounter = -1;

        for(int i = 0; i < A.length; i++){
            // Check whetehr the ith element exists in the hashmap
            if(leaves.containsKey(A[i])){
                // If element exists, change its value to true 
                leaves.replace(A[i], true);
                //Increase count by 1. Note that the seconds start from -1 so that the first hit takes it to 0. 
                secondsCounter++;
                // Check if all leaves fell  and return the seconds counter
                if(allLeavesFell(leaves)){
                    return secondsCounter;
                }
                
            }
        }
        // If all leaves where not seen
        return -1;

    }

    // Helper function to check whether all leaves fell.
    private boolean allLeavesFell(HashMap<Integer, Boolean> leavesMap){
        // Check each value to see if true 
        for (Boolean value : leavesMap.values()){
            if (value != true){
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        GKFrogRiverOne myClass = new GKFrogRiverOne();
        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;

        int seconds = myClass.solution(X, A);
        System.out.print(seconds);
    
    }
    



    
}
