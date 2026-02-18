class Solution {

    /**

     below solution is using state machin and bottom up ;
     watch video again from code with MIK and code it again after some time,

     */


    public long maxAlternatingSum(int[] nums) {
        int n =nums.length;
        if(n<=2){
            return nums[0];
        }
        long[][] memo = new long[n+1][2];

        memo[0][0]=0;
        memo[0][1]=0;

        for(int i =1;i<n+1;i++){
            memo[i][0] = Math.max(memo[i-1][1]-nums[i-1], memo[i-1][0]);
            memo[i][1] = Math.max(memo[i-1][0]+nums[i-1], memo[i-1][1]);
        }
        return  Math.max(memo[n][0],memo[n][1]);
    }




    /**

     Below solution is using memoization
     */
    // int n =0;
    //  long [][] memo = new long[100001][2];

    // public long maxAlternatingSum(int[] nums) {
    //     n =nums.length;
    //     if(n<=2){
    //         return nums[0];
    //     }

    //     Arrays.stream(memo).forEach(row -> Arrays.fill(row, -1));

    //     boolean isEven=true;
    //     return solve(nums,0,true);//true for even number index it correspondrs to plus
    // }

    // long solve(int[] nums,int startIndex, boolean isEven){
    //     if(startIndex>=n){
    //         return 0;
    //     }

    //     int myInt = isEven ? 1 : 0;
    //     if(memo[startIndex][myInt]!=-1){
    //         return memo[startIndex][myInt];
    //     }

    //     long val = nums[startIndex];

    //     long skip = solve(nums,startIndex+1,isEven);


    //     if(isEven == false){
    //         val=-val;
    //     }

    //     long take = solve(nums, startIndex+1,!isEven)+val;

    //     return memo[startIndex][myInt]= Math.max(skip,take);
    // }
}