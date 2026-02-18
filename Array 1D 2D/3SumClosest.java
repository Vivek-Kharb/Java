class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closetSum=100000;
        Arrays.sort(nums);

        for(int i = 0; i<n-2;i++){
            int left=i+1;
            int right= n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-closetSum)){
                    closetSum=sum;
                }
                if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return closetSum;
    }
}