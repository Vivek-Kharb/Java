class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int num: nums){
            pq.add(num);
        }
        long maxSum=0;

        for(int i =0;i<k;i++){
            int sum = pq.poll();
            maxSum=maxSum+sum;

            sum = (int) Math.ceil(sum / 3.0);
            pq.add(sum);
        }

        return maxSum;
    }
}