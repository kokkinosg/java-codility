package com.dherbet.codility.lesson2;

import java.util.HashSet;

public class GKOddOccurrences_3 {

    public int solution(int[] A){
        HashSet<Integer> set = new HashSet<>(); // HashSet. Add element the first time you see it, remove it the second time. Element left is the answer.

        for(int i = 0; i < A.length; i++){
            int element = A[i];
            if(set.contains(element)){ // If element exists in set, remove it.
                set.remove(element);
            } else { // If element doesnt exist in set, add it
                set.add(element);
            }
        }
        return set.iterator().next(); // Return the only element in the set.
    }

    public static void main(String[] args){
        GKOddOccurrences_3 myClass = new GKOddOccurrences_3();
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(myClass.solution(A));
    
    }
}


