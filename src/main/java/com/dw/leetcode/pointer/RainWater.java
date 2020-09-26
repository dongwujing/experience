package com.dw.leetcode.pointer;

public class RainWater {
    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
        int total=RainWater.trap(nums);
        System.out.println(total);
    }

    private static int trap(int[] nums) {
        if (nums==null || nums.length==0) return 0;

        int length=nums.length;
        int left=0;
        int right=length-1;

        int leftHeight=nums[left];
        int rightHeight=nums[right];
        int sum=0;

        while (left<right){
            if (leftHeight<rightHeight){
                if (leftHeight>nums[left+1]){
                    sum+=leftHeight-nums[left+1];
                }else {
                    leftHeight=nums[left+1];
                }
                left++;
            }
            else{
                if (rightHeight>nums[right-1]){
                    sum+=rightHeight-nums[right-1];
                }else {
                    rightHeight=nums[right-1];
                }
                right--;
            }
        }
        return sum;
    }
}
