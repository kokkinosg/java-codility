package com.dherbet.codility.lesson4;
import java.util.HashSet;

public class GKFrogRiverOne_3 {
    public int solution(int X, int[] A){
        // I am going to use a hashSet. I know that it will need X elements. A set does not store duplicates, so the first time 
        // the size of the set is equal to X, it means all leaves are there and the frog can cross.  
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < A.length; i++){
            set.add(A[i]); // Add all elements in the set. 
            if (set.size()==X){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        GKFrogRiverOne_3 myClass = new GKFrogRiverOne_3();
        int X = 5;
        int[] A = {1,3,1,4,2,3,5,4};
        System.out.println(myClass.solution(X, A));
    }
}
