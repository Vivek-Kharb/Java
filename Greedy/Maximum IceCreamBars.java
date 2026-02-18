class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n =costs.length;

        int bars=0;

        Arrays.sort(costs);
        int i =0;
        while(i<n && coins>=costs[i]){
            coins-=costs[i];
            i++;
            bars++;
        }
        return bars;
    }

}