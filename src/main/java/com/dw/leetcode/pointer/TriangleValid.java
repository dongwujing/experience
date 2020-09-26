package com.dw.leetcode.pointer;

import java.util.Arrays;

/**
 * 验证三角形 有几种
 */
public class TriangleValid {
    public static void main(String[] args) {
        int[] nums={2,2,3,4};
        int result=new TriangleValid().valid(nums);
        System.out.println(result);
    }

    private int valid(int[] nums) {
        if (nums==null || nums.length==0) return 0;

        Arrays.sort(nums);
        int total=0;
        for (int k=nums.length-1;k>=2;k--){
            int start=0;
            int end=k-1;
            while (start<end){
                if (nums[start]+nums[end]>nums[k]){
                    total+=(end-start);
                    end--;
                }else {
                    start++;
                }
            }
        }
        return total;
    }
}
