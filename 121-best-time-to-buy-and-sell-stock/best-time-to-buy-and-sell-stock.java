class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int highestProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>lowestPrice)
            {
                int currentProfit=prices[i]-lowestPrice;
                if(currentProfit>highestProfit)
                {
                    highestProfit = currentProfit;
                }
            }
            if(prices[i]<lowestPrice)
            {
                lowestPrice = prices[i];
            }
        }
        return highestProfit;
    }
}