class Solution {

    public int minOperations(int[] nums, int k) {
        int count=0;

        PriorityQueue<Long>  minHeap = new PriorityQueue<>();


        for(int i :nums){
            minHeap.add((long)i);
        }

        while(minHeap.peek() < k){
            long a = minHeap.poll();
            long b = minHeap.poll();
            minHeap.add(a*2+b);
            count++;
        }

        return count;

    }
}