class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int answer=0;

        for(int i =0;i<32;i++){
            int countOfZero =0;
            int countOfOne = 0;
            int temp = (1 << i);
            for(int j=0;j<n;j++){
                if((nums[j] & temp)==0){
                    countOfZero++;
                }
                else countOfOne++;
            }

            if((countOfOne %3) ==1){
                answer = (answer | temp);
            }
        }

        return answer;
    }
}