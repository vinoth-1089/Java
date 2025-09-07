package Medium;

class Best_time_sell_buy {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);
    }

  
    public static int maxProfit(int[] prices) {
        int profit = 0;                      
        int min_value = prices[0];           

        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - min_value;       
            profit = Math.max(profit, cost);        
            min_value = Math.min(prices[i], min_value); 
        }

        return profit;
    }
}
