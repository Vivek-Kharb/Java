class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        int element =nums[0];
        int count = 1;

        for(int i =1;i<n;i++){
            if(nums[i]!=element) count--;
            else count++;

            if(count==0){
                element=nums[i];
                count=1;
            }

        }
        return element;

        //     HashMap<Integer,Integer> hm = new HashMap<>();
        //     int max=0;
        //     for (int i = 0; i<n;i++){
        //         if(!hm.containsKey(nums[i])){
        //             hm.put(nums[i],1);
        //         }
        //         else{
        //             int value=hm.get(nums[i]);
        //             value++;
        //             hm.put(nums[i], value);
        //         }
        //     }
        //   //  max= hm.get(nums[0];)
        //  // int maxKey=0;
        //     for(Integer k : hm.keySet()){
        //         if(hm.get(k)>n/2){
        //              return k;
        //         }
        //     }
        //    return 0;
    }
}