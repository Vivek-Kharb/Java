class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int finalMax=0;
        HashSet<Integer> st= new HashSet<>();
        for(int j =0;j<nums.length;j++){
            if(!st.contains(nums[j])) st.add(nums[j]);
        }
        while(!st.isEmpty()){
            int k = st.iterator();
            int backward = k-1;
            int forward=k+1;
            while(st.contains(backward)){
                st.remove(backward);
                max++;
                backward--;
            }
            while(st.contains(forward)){
                st.remove(forward);
                max++;
                forward++;
            }
            finalMax= Math.max(max,finalMax);
            max=0;
        }
        // for(int i: st){
        //     if(st.contains(i-1)){
        //         continue;
        //     }
        //     while(st.contains(i++)){
        //         max++;
        //     }
        //     finalMax= Math.max(max,finalMax);
        //     max=0;
        // }
        return finalMax;
    }
}