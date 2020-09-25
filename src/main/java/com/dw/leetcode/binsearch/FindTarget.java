package com.dw.leetcode.binsearch;


public class FindTarget {
    public static void main(String[] args) {
        int[] num={11,15,16,1,3,8,9};
        int target=3;
        int idx=new FindTarget().search(num,target);
        System.out.println(idx);
    }

    private int search(int[] num, int target) {
        if (num==null || num.length==0) return -1;

        int start=0;
        int end=num.length-1;
        int mid;
        while (start+1<end){
            mid=start+(end-start)/2;
            if (num[mid]==target){
                return mid;
            }
            if(num[mid]>num[start]){
                if (target<num[mid]&& num[start]>target){
                    end=mid;
                }else {
                    start=mid;
                }
            }else {
                if (target>=num[mid] && target<=num[end]){
                    start=mid;
                }else {
                    end=mid;
                }
            }
        }

        if (num[start]==target)return start;
        if (num[end]==target)return end;
        return -1;
    }
}
