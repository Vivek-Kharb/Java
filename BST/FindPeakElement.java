class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end = nums.length-1;
        int mid= 0; //start+(end-start)/2 ;

        // if(end==0 || nums[0]>nums[1] ){
        //     return 0;
        // }
        // if(nums[end]>nums[end-1]){
        //     return end;
        // }

        while(start<=end){
            mid = start+(end-start)/2 ;
            if( (mid==0 || (nums[mid]>nums[mid-1])) &&
                    ((mid == nums.length-1)|| (nums[mid]>nums[mid+1]) )
            ){
                return mid;
            }
            if (nums[mid]>nums[mid+1])
                end=mid-1;
            else
                start=mid+1;

        }

        // while(start!=end){
        //     if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
        //         return mid;
        //     }
        //     else if(nums[mid]>nums[start] && nums[mid]>=nums[end] && nums[mid]>nums[mid-1]){
        //         start=mid;
        //     }
        //     else if (nums[mid]>nums[start] && nums[mid]<nums[end]){
        //         start=mid;
        //     }
        //     else{
        //         end=mid;
        //     }
        //     mid=start+(end-start)/2 ;
        // }
        return mid;
    }
}