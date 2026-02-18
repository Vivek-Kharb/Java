class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int startIndex=0;
        int endIndex = n-1;
        int midIndex=startIndex + (endIndex-startIndex)/2;
        int minimum=nums[0] ;

        while(startIndex<=endIndex){
            if(minimum>nums[midIndex])
                minimum=nums[midIndex];
            if (nums[midIndex]> nums[endIndex]){
                startIndex=midIndex+1;
                midIndex=startIndex+(endIndex-startIndex)/2 ;
            }
            else{
                endIndex=midIndex-1;
                midIndex=startIndex+(endIndex-startIndex)/2 ;
            }
        }
        return minimum;
    }
}