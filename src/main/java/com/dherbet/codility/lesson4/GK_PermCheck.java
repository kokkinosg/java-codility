package com.dherbet.codility.lesson4;

import java.util.HashSet;

public class GK_PermCheck {
    public int solution(int[] A){
        // My ideas is to add all elements from 1 to N in a set and remove them when you see them from A. 
        // if after removing all elements of A from set, an element is left, it is not a permutation.

        HashSet<Integer> set = new HashSet<>();
        int N = A.length;

        // Add all integers from 1 to N on the set
        for(int i = 1; i <= N; i++){
            set.add(i);
        }

        // Loop over all emeents of A and remove them from set. 
        for(int i = 0; i < A.length; i++){
            if (!set.contains(A[i])){ // If the set does not contain an element from A, it is not a permutation, escape early.
                return 0;
            } else {
                // Try to remove it. If it doesnt exist, it means that A had an element more than once, which is also not a permutation
                if(!set.remove(A[i])){
                    return 0;
                }
            }
            // If all is well and the A[i] was removed continue to the next. 
        }

        // Check that hte set has all elements removed, meaning that A is a permutation. 
        if(set.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        GK_PermCheck myClass = new GK_PermCheck();
        int[] A = {4,1,3,2};
        int[] B = {4,1,3,2,6};

        System.out.println(myClass.solution(A));
        System.out.println(myClass.solution(B));
    }
    
}
