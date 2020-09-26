package com.dw.leetcode.pointer;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三个数相加为0
 */
public class Sum3 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result=new Sum3().threeSum(nums);
        System.out.println(JSON.toJSONString(result));
    }

    private List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if (nums==null|| nums.length==0) return null;

        Arrays.sort(nums);
        int len=nums.length;
        for (int i=0;i<len-2;i++){
            int left=i+1;
            int right=len-1;
            while (left<right){
                if (nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while (left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return result;
    }
}
