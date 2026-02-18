class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int startIndex=0;
        int endIndex = n-1;
        int midIndex=startIndex + (endIndex-startIndex)/2;


        while(startIndex<=endIndex){
            if(target==nums[midIndex])
                return midIndex;
            if((nums[midIndex]>nums[endIndex])){
                if((target >=nums[startIndex]) && (target<=nums[midIndex]) ){
                    endIndex=midIndex-1;
                    midIndex=startIndex + (endIndex-startIndex)/2;
                }
                else{
                    startIndex=midIndex+1;
                    midIndex=startIndex + (endIndex-startIndex)/2;
                }
            }
            else{
                if((target <= nums[endIndex]) && (target >=nums[midIndex]) ){
                    startIndex=midIndex+1;
                    midIndex=startIndex + (endIndex-startIndex)/2;
                }
                else{
                    endIndex=midIndex-1;
                    midIndex=startIndex + (endIndex-startIndex)/2;
                }
            }
        }
        return -1;
    }
}