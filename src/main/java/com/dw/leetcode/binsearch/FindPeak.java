package com.dw.leetcode.binsearch;

/**
 *快手面试题
 * 找山峰
 */
public class FindPeak {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
        int[] nums={1,2,1,3,5,6,4};
        int target=new FindPeak().search(nums);
        System.out.println(target);
    }

    private int search(int[] nums) {
        if (nums==null || nums.length==0) return -1;

        int start=0;
        int end=nums.length-1;
        int mid;
        while (start+1<end){
            mid=start+(end-start)/2;
            if (nums[mid]<nums[mid-1]){
                end=mid;
            }else if(nums[mid]<nums[mid+1]){
                start=mid;
            }else {
                return mid;
            }
        }

        return nums[start]>nums[end]?start:end;
    }
}
