package com.striver.ds;

public class MaxConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, World!");
        int nums[] = { 1, 1, 0, 1, 1, 1,1,1 };
        int cnt = 0;
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
            
        }
        System.out.println(maxi);
        
        
    }
}


