class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> solution = new ArrayList<>();

        for(int i=0;i<n;i++){
            int num1=nums[i];
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            if(num1>0){
                return solution ;
            }

            int left=i+1;
            int right=n-1;

            while(left<right){
                if(nums[left]+nums[right]>-num1){
                    right--;
                }
                else if (nums[left]+nums[right]<-num1){
                    left++;
                }
                else {
                    solution.add(Arrays.asList(num1, nums[left], nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }

        return solution;
    }
}