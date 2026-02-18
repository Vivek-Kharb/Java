class Solution {
    int[][] memo = new int[301][11];

    int solve(int[] jobs, int index, int days){
        if(days==1){
            int maxDifficult = jobs[index];
            for(int i =index;i<jobs.length;i++){
                maxDifficult= Math.max(maxDifficult,jobs[i]);
            }
            return maxDifficult;
        }

        if(memo[index][days]!=-1){
            return memo[index][days];
        }
        int maxDifficult = jobs[index];

        int finalResult  = Integer.MAX_VALUE;

        for(int i = index;i<=jobs.length-days;i++){
            maxDifficult= Math.max(maxDifficult, jobs[i]);
            int result = maxDifficult + solve(jobs, i+1,days-1);
            finalResult = Math.min(result, finalResult);
        }
        return memo[index][days] = finalResult;
    }

    public int minDifficulty(int[] jobs, int d) {
        int n = jobs.length;
        if(d>n){
            return -1;
        }

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(jobs, 0, d);
    }
}