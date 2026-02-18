class Solution {
    public int maxSubArray(int[] array) {
        int n = array.length;

        int currentMax=array[0];
        int maxSoFar=array[0];

        for(int i =1 ;i<n;i++){
            currentMax=Math.max(array[i],array[i]+currentMax);
            maxSoFar= Math.max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }
}