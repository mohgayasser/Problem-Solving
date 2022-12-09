class Solution {
    public int maxProfit(int[] prices) {
       int i,min=prices[0],Profit=0,max=prices[0];
      for(i=1;i<prices.length;i++){
          if(min>prices[i]&&i<prices.length-1){
              min=prices[i];
              max=prices[i];
          }else if(max<prices[i]&&Profit<prices[i]-min){
              max=prices[i];
              Profit=max-min;
          }
      }
      return Profit;
    }
}
