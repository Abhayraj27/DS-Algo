//package com.ds.leetcode;
//
//public class BestTimeToSellAndBuyStock {
//
//	public int maxProfit(int[] prices) {
//		// TODO Auto-generated method stub
//
//		int maxProfits = 0;
//		int minSofar = prices[0];
//
//		for (int i = 0; i < prices.length; i++) {
//			minSofar = Math.min(minSofar, prices[i]);
//			int profit = prices[i] - minSofar;
//			maxProfits = Math.max(maxProfits, profit);
//
//		}
//
//		return maxProfits;
//	}
//	
//	public static void main() {
//		
//		System.out.print(maxProfit(int[] prices));
//		
//	}
//
//}
