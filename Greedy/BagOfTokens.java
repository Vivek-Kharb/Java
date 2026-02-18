class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        int n = token.length;
        int faceUpIndex=0;
        int faceDownIndex=n-1;
        int currentScore=0;
        int maxScore = 0;
        Arrays.sort(token);

        while(faceUpIndex<=faceDownIndex){
            if(power>=token[faceUpIndex]){
                power=power-token[faceUpIndex];
                currentScore++;
                maxScore = Math.max(currentScore,maxScore);
                faceUpIndex++;
            }
            else if(currentScore>=1){
                power=power+token[faceDownIndex];
                currentScore--;
                faceDownIndex--;
            }
            else{
                return maxScore;
            }
        }
        return maxScore;
    }


    // public int bagOfTokensScore(int[] token, int power) {
    //     int n =token.length;
    //     Arrays.sort(token);
    //     int maxScore=0;
    //     int score=0;
    //     int faceUpIndex =0;
    //     int faceDownIndex = n-1;

    //     while(faceUpIndex<=faceDownIndex){
    //         int loopCounter=0;
    //         while(faceUpIndex<= n-1 && power>=token[faceUpIndex]){
    //             power=power-token[faceUpIndex];
    //             faceUpIndex++;
    //             score++;
    //             maxScore= Math.max(maxScore, score);
    //             loopCounter++;
    //         }
    //         if(score>=1 && (faceDownIndex-faceUpIndex > 1)){
    //             power=power+token[faceDownIndex];
    //             score--;
    //             faceDownIndex--;
    //             loopCounter++;
    //         }

    //         if(loopCounter==0){
    //             break;
    //         }
    //     }
    //     return maxScore;
    // }
}