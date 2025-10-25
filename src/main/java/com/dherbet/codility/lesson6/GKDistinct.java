package com.dherbet.codility.lesson6;
import java.util.HashSet;

public class GKDistinct {

    // Add all elements from array to HashSet. 
    public int solution (int[] A){
        HashSet<Integer> uniqueInt = new HashSet<>();

        for (int i = 0 ; i<A.length; i++){
            uniqueInt.add(A[i]);
        }
        return uniqueInt.size();
    }

    public static void main(String[] args) {
        GKDistinct myClass = new GKDistinct();
        int[] A = {2,1,1,2,3,1,4};
        System.out.println(myClass.solution(A));
    }
    
}
