class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int testNumber=nums[0];
        int trackerIndex=0;

        for(int i=0;i<length;){
            while(i<length && nums[i]==testNumber){
                i++;
            }
            if(i==length){
                nums[trackerIndex]=nums[i-1];
                trackerIndex++;
                return trackerIndex;
            }
            else{
                nums[trackerIndex]=nums[i-1];
                testNumber=nums[i];
                trackerIndex++;
            }
        }
        return trackerIndex;
    }
}