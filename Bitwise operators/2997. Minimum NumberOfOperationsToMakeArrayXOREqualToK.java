class Solution {

    public int minOperations(int[] nums, int k) {
        int xor=0;

        for(int j =0;j<nums.length;j++){
            xor=xor^nums[j];
        }



        return Integer.bitCount(xor^k);
    }
    // public int minOperations(int[] nums, int k) {
    //     int count =0;
    //     int xor=0;

    //     for(int i =0;i<32;i++){
    //         for(int j =0;j<nums.length;j++){
    //             xor=xor^(nums[j] & 1);
    //             nums[j]>>=1;
    //         }
    //         if(xor==0 && (k & 1) ==1){
    //             count++;
    //         }
    //         if(xor==1 && (k & 1) ==0){
    //             count++;
    //         }
    //         k>>=1;
    //         xor=0;
    //     }

    //     return count;
    // }
}