class Solution {
    public void sortColors(int[] nums) {
        int[] colour = new int[3];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                colour[0]++;
            }
            else if(nums[i]==1){
                colour[1]++;
            }
            else
                colour[2]++;
        }

        int k =0;
        for(k = 0;k<colour[0];k++){
            nums[k]=0;
        }
        for(k = colour[0];k<colour[0]+colour[1];k++){
            nums[k]=1;
        }
        for(k = colour[0]+colour[1] ;k<colour[0]+colour[1]+colour[2];k++){
            nums[k]=2;
        }
    }
}