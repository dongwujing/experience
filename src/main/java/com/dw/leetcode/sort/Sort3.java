package com.dw.leetcode.sort;

/**
 * 冒泡排序
 */
public class Sort3 {
    public static void main(String[] args) {
        int[] nums=genNums(100);
        int[] result= new Sort3().bubbleSort(nums);
        int[] result2= new Sort3().insertSort(nums);
        int[] result3= new Sort3().selectSort(nums);
        for (int i : result) {
            System.out.print(i+",");
        }
    }

    private int[] selectSort(int[] nums) {
        return new int[0];
    }

    private int[] insertSort(int[] nums) {
        return new int[0];
    }

    private static int[] genNums(int num) {
        int[] nums=new int[num];
        for (int i = 0; i < num; i++) {
            nums[i]=(int)(Math.random()*1000);
        }
        return nums;
    }

    private int[] bubbleSort(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length-i;j++){
                if (nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
