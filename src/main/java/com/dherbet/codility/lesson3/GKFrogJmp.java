package com.dherbet.codility.lesson3;

public class GKFrogJmp {

    public int solution(int X, int Y, int D){
        // Number of jumps is the Y - X / D but rounded upwards. Because X,Y,D are int, i have to type cast into double. Because the result needs to be int I type cast from double back to int. 
        double doubleY = (double) Y;
        double doubleX = (double) X;
        double doubleD = (double) D;

        double jumpNoExact = (doubleY-doubleX)/doubleD;
        int roundedJumpNo = (int) Math.ceil(jumpNoExact);
        return roundedJumpNo;
    }

    public static void main(String[] args) {
        int startPos = 10;
        int endPos = 85;
        int distanceJump = 30;
        GKFrogJmp gkFrogJmp = new GKFrogJmp();
        int jumpNo = gkFrogJmp.solution(startPos,endPos,distanceJump);
        System.out.printf("Start Pos. = %d \n End Pos. = %d \n Distance per Jump = %d \n Number of Jumps = %d",startPos,endPos, distanceJump, jumpNo);
    }
    
}
