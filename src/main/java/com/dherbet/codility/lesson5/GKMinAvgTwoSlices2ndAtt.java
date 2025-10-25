package com.dherbet.codility.lesson5;

public class GKMinAvgTwoSlices2ndAtt {

    public int solution(int[] A){
        // Any slice is made up of pieces of 2 slices or 3 slices. By definition the minimum avg will be made up of 2 or 3 pieces. 
        double minimalAvg = Double.MAX_VALUE;
        int minimalP = Integer.MAX_VALUE;

        // Calculate first the avg for 2 slices
        for (int i = 0 ; i < A.length-1 ; i++){
            double avg = calcAvg(i, i+1, A);
            if (avg < minimalAvg){
                minimalAvg = avg;
                minimalP = i;
            }
        }

        // Calculate secondly the avg for 3 slices
        for (int i = 0 ; i < A.length-2 ; i++){
            double avg = calcAvg(i, i+2, A);
            if (avg < minimalAvg){
                minimalAvg = avg;
                minimalP = i;
            }
        }

        return minimalP;
    }

    private double calcAvg(int P, int Q, int[] A){
        
        // Calculate the sum of elements 
        int sum = 0;
        
        // Go over index from P to Q and calculate the average
        for (int i = P; i <= Q; i++){
            sum += A[i];
        }

        return sum/((Q-P)+1);
    }

    public static void main(String[] args) {
        GKMinAvgTwoSlices2ndAtt myClass = new GKMinAvgTwoSlices2ndAtt();
        int[] A = {4,2,2,5,1,5,8};
        System.out.println(myClass.solution(A));
    }
    
}
