package com.dherbet.codility.lesson6;

public class GKTriangle {

    public int solution(int[] A){

        // Do the brute force way 
        for (int P =0 ; P < A.length-2; P++){
            for (int Q = P+1 ; Q < A.length-1; Q++){
                for (int R = Q+1; R < A.length; R++){
                    if(ruleCheck(P, Q, R, A)){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    private boolean ruleCheck(int P, int Q, int R, int[] A){
        
        int sumPQ = A[P] + A[Q];
        int sumQR = A[Q]+A[R];
        int sumPR = A[P] + A[R];

        if(sumPQ>A[R] && sumQR>A[P] && sumPR>A[Q]){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        GKTriangle myClass = new GKTriangle();

        int[] A = {10,2,5,1,8,20};

        System.out.println(myClass.solution(A));
    }
}
