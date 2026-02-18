class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        int maxProfit=0;
        int currentProfit=0;
        int maxElement=prices[n-1];

        for(int i=n-1;i>=0;i--){
            if(prices[i]>maxElement){
                maxElement=prices[i];
            }
            currentProfit=maxElement-prices[i];

            if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }
        }
        return maxProfit;
    }
}