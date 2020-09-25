package com.dw.leetcode.binsearch;

public class BinSearch {
    public static void main(String[] args) {
        int[] num={1,3,5,7,9,11,22,33};
        int target=9;
        int idx=new BinSearch().search(num,target);
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
            else if(target<num[mid]){
                end=mid;
            }else {
                start=mid;
            }
        }

        if (num[start]==target)return start;
        if (num[end]==target)return end;
        return -1;
    }
}
