class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        int sum =0;

        for(int i: piles){
            pq.add(i);
            sum=sum+i;
        }

        for(int i =0;i<k;i++){
            int takenOut = pq.poll();
            int floor =(int) Math.floor(takenOut/2);
            sum=sum-floor;
            int difference = takenOut-floor;
            pq.add(difference);
        }



        return sum;
    }
}