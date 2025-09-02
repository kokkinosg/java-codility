package com.dherbet.codility.lesson4;
import java.util.HashSet;

public class GKFrogRiverOne2ndAtt {

    public int solution (int X, int[] A){


        // Create a set with all possible positions
        HashSet<Integer> leaves = new HashSet<>();

        // Populate the hashSet with all possible posititons 
        for(int i = 1; i <= X; i++){
            leaves.add(i);
        }

        // Go over each element in A and if it exists in Set, remove it. Once the set is empty thats the soonest the frog can cross
        for (int j = 0; j <A.length; j++){
            // If it exists in set, it rremoves it otherwise it does nothing
            leaves.remove(A[j]);
            // check the set is empty. if it is thats it.
            if(leaves.isEmpty()){
                return j;
            }
        }

        // If set never became empty, it means that not all positions where covered so the from cannto cross 
        return -1;
    }

    public static void main(String[] args) {
        GKFrogRiverOne2ndAtt myClass = new GKFrogRiverOne2ndAtt();
        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;

        System.out.print(myClass.solution(X, A));
    }
    
}
