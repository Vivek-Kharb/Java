class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;

        int startIndex = 0;
        int endIndex= n-1;
        int midIndex= startIndex+(endIndex-startIndex)/2 ;

        boolean isPresent = true ;

        while(startIndex<=endIndex){
            if(target==nums[midIndex]){
                return isPresent;
            }

            while(startIndex<=endIndex && nums[startIndex]==nums[midIndex] && nums[midIndex]==nums[endIndex] ){
                startIndex++;
                endIndex--;
            }
            if(startIndex<=endIndex && nums[midIndex] <=nums[endIndex]){
                if( target<nums[midIndex] || target>nums[endIndex]){
                    endIndex=midIndex-1;
                    midIndex= startIndex+(endIndex-startIndex)/2 ;
                }
                else{
                    startIndex=midIndex+1;
                    midIndex= startIndex+(endIndex-startIndex)/2 ;
                }
            }
            else {
                if(startIndex<=endIndex && (target<nums[startIndex] || target > nums[midIndex])){
                    startIndex=midIndex+1;
                    midIndex= startIndex+(endIndex-startIndex)/2 ;
                }
                else{
                    endIndex=midIndex-1;
                    midIndex= startIndex+(endIndex-startIndex)/2 ;
                }
            }
            // else((nums[midIndex]==nums[endIndex])){

            // }
        }



        return !isPresent;
    }
}