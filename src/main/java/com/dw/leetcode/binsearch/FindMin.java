package com.dw.leetcode.binsearch;

/**
 * 旋转有序的数组中找最小
 */
public class FindMin {
    public static void main(String[] args) {
        int[] nums={11,12,15,19,2,3,5,9};
        int idx=new FindMin().search(nums);
        System.out.println(idx);
    }

    private int search(int[] nums) {
        if (nums==null || nums.length==0) return -1;
        int start=0;
        int end=nums.length-1;
        int mid;

        while (start+1<end){
            mid=start+(end-start)/2;
            if (nums[mid]>nums[start]){
                if (nums[end]>=nums[mid]){
                    end=mid;
                }else {
                    start=mid;
                }
            }else{
                end=mid;
            }
        }

        return Math.min(nums[start],nums[end]);
    }
}
