class Solution{


    /**

     using constant space
     */

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        int prevOfPrev= nums[0]; // for nums.length==1
        int prev= Math.max(nums[0],nums[1]);// // for nums.length==2
        int answer=0;
        for(int i = 2;i<n;i++){
            int skip = prev;
            int rob = nums[i]+prevOfPrev;
            answer= Math.max(skip, rob);
            prevOfPrev= prev;
            prev=answer;
        }
        return answer;
    }

/*
Memoization method
 */

    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     if(n==1){
    //         return nums[0];
    //     }
    //     if(n==2){
    //         return Math.max(nums[0],nums[1]);
    //     }
    //     int[] memo= new int[n+1];

    //     memo[0]=nums[0];
    //     memo[1]= Math.max(nums[0],nums[1]);

    //     for(int i = 2;i<n;i++){
    //         memo[i]= Math.max(nums[i]+memo[i-2], memo[i-1]);
    //     }

    //     return memo[n-1];
    // }
/**

 top down and memoization apporach
 */


    // int maxAmount = Integer.MIN_VALUE;
    // int[] memo  = new int[100];
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     if(n==1){
    //         return nums[0];
    //     }
    //     if(n==2){
    //         return Math.max(nums[0],nums[1]);
    //     }

    //     Arrays.fill(memo,-1);

    //     return findMax(nums, 0, n);
    // }

    // int findMax(int[] nums, int startIndex, int length){
    //     if(startIndex>=length){
    //         return 0;
    //     }
    //     if(memo[startIndex]!=-1){
    //         return memo[startIndex];
    //     }
    //     int currentMax  =   nums[startIndex];

    //     maxAmount = Math.max(currentMax+findMax(nums,startIndex+2,length) ,
    //                          findMax(nums,startIndex+1,length));


    //     return memo[startIndex] = maxAmount;

    // }
}