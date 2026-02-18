class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i=0,k=0,j=0;
        for(i =0;i<nums1.length;i++){
            k = nums1[i];
            while(nums2[j]!=k){
                j++;
            }
            j++;
            while(j<nums2.length &&  nums2[j]<k){
                j++;
            }
            if(j==nums2.length){
                nums1[i]= -1;
            }
            else
                nums1[i]= nums2[j];

            j=0;
        }
        return nums1;
    }
}