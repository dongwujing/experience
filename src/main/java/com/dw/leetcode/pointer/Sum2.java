package com.dw.leetcode.pointer;

import com.alibaba.fastjson.JSON;

public class Sum2 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result= new Sum2().twoSum(nums,target);
        System.out.println(JSON.toJSONString(result));
    }

    private int[] twoSum(int[] nums, int target) {
        if (nums==null || nums.length==0) return null;

        int[] result={-1,-1};
        int start=0;
        int end=nums.length-1;
        while (start<end){
            if (nums[start]+nums[end]>target){
                end--;
            }
            else if(nums[start]+nums[end]<target){
                start++;
            }
            else {
                result[0]=start+1;
                result[1]=end+1;
                break;
            }
        }

        return result;
    }
}
