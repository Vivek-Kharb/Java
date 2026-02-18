class Solution {

    /**
     below solution using constant spac
     */
    /**

     this answer is wrong ans rest of other below answer are right,
     i'm skipping this to solve other problems, can watch codewithMIK youtube
     */

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        int result1;
        int result2;

       /*
        while robbing zero index

        */
        // memo[0]=0;// state in 0 when we have 0 house, we can't rob anything
        // memo[1]= nums[0];



        //when only 1 house max value we can rob is of only that house,
        // here memo index in number of houses in input;
        int prevOfPrev = 0; //inititlally zero house so answer is zero
        int prev = nums[0];// only one house to rob so answer is nums[0]
        int answer=0;
        for(int i =1;i<=n-1;i++){
            int skip = prev;
            int rob = prevOfPrev;

            answer = Math.max(prev, nums[i-1]+((i-2>=0)?prevOfPrev:0));
            //memo[i]=Math.max(memo[i-1],nums[i-1]+((i-2>=0)?memo[i-2]:0));

            prevOfPrev=prev;
            prev=answer;
        }

        result1= prev;

        prevOfPrev=0;
        prev= 0;
        answer=0;

        for(int i = 2; i<=n; i++){
            int skip = prev;
            int rob= prevOfPrev;
            answer = Math.max(prev , nums[i-1]+ ((i-2 >= 0) ? prevOfPrev : 0 ));
            prevOfPrev=prev;
            prev=answer;
        }
        result2 = answer;

        return Math.max(result1, result2);
    }

    /**
     below solution bottom up
     */
    // int[] memo = new int[101];
    // int maxProfit=0;

    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     if(n==1){
    //         return nums[0];
    //     }
    //     if(n==2){
    //         return Math.max(nums[0],nums[1]);
    //     }

    //     int result1;
    //     int result2;

    //    /*
    //     while robbing zero index

    //     */
    //     memo[0]=0;// state in 0 when we have 0 house, we can't rob anything
    //     memo[1]= nums[0];
    //     //when only 1 house max value we can rob is of only that house,
    //     // here memo index in number of houses in input;

    //     for(int i =1;i<=n-1;i++){
    //         memo[i]=Math.max(memo[i-1],nums[i-1]+((i-2>=0)?memo[i-2]:0));
    //     }

    //     result1= memo[n-1];

    //     Arrays.fill(memo,0);

    //     memo[0]=0;
    //     memo[1]= 0;

    //     for(int i = 2; i<=n; i++) {
    //         memo[i] = Math.max(memo[i-1] , nums[i-1]+ ((i-2 >= 0) ? memo[i-2] : 0 ));
    //     }
    //     result2 = memo[n];

    //     return Math.max(result1, result2);
    // }




    /*

    below commented solution is using memo and recusrions






     */

    // int[] memo = new int[101];
    // int maxProfit=0;
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     if(n<=1){
    //         return nums[0];
    //     }
    //     if(n==2){
    //         return Math.max(nums[0],nums[1]);
    //     }

    //     Arrays.fill(memo,-1);
    //     int robbingZeroIndex = nums[0]+ solve(nums,2, n-2);

    //     Arrays.fill(memo,-1);
    //     int notRobbingZeroIndex = solve(nums, 1,n-1);

    //     return Math.max(robbingZeroIndex , notRobbingZeroIndex);
    // }

    // int solve (int[] nums, int startIndex, int lastIndex){
    //     if(lastIndex<startIndex){
    //         return 0;
    //     }
    //     if(memo[startIndex]!=-1){
    //         return memo[startIndex];
    //     }

    //     int currentValue= nums[startIndex];

    //     for(int i = startIndex; i<=lastIndex;i++){
    //         maxProfit = Math.max(currentValue+solve(nums,startIndex+2,lastIndex),
    //                                     solve(nums,startIndex+1,lastIndex));

    //     }

    //     return memo[startIndex]= maxProfit;
    // }
}


















