package com.test;

import java.util.Arrays;

class Solution {
  public int maxProfit(int[] prices) {
    if(prices.length <= 0) return 0;

    int minBuyPrice = prices[0];
    int maxProfit = 0;

    for(int i = 1; i < prices.length; i++) {
      if(prices[i] <= minBuyPrice) {
        minBuyPrice = prices[i];
      } else {
        if(prices[i] - minBuyPrice > maxProfit)
          maxProfit = prices[i] - minBuyPrice;
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {

    int arr[] = {7,1,5,3,6,4};
    int arr2[] = {7,6,4,3,1};

    Solution test = new Solution();
    System.out.println(test.maxProfit(arr));
    System.out.println(test.maxProfit(arr2));
    int temp=0;
    for(int i=0;i<arr.length;i++){
      for(int j=arr.length-1;j>0;j--){
          temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
      }
    }
    for(int k=0;k<arr.length;k++)
    System.out.println(arr[k]);
  }
}
