class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] solution = new int[2];
        hm.put(nums[0],0);

        for(int i =1;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                solution[0]=hm.get(target-nums[i]);
                solution[1]=i ;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return solution;
    }
}
