package com.dw.leetcode.sort;

import com.alibaba.fastjson.JSON;

/**
 * 冒泡排序
 */
public class Sort3 {
    public static void main(String[] args) {
        int[] nums=genNums(10000);
        int[] result= new Sort3().bubbleSort(nums);
        int[] nums2=genNums(10000);
        int[] result2= new Sort3().insertSort(nums2);
        int[] nums3=genNums(10000);
        int[] result3= new Sort3().selectSort(nums3);

        int[] nums4=genNums(10);
        int start=0,end=nums4.length-1;
        new Sort3().quickSort(nums4,start,end);
        System.out.println(JSON.toJSONString(nums4));

        int[] num5=genNums(10);
        new Sort3().mergeSort(num5);
        System.out.println(JSON.toJSONString(num5));
    }

    private void mergeSort(int[] num5) {
        int[] temp=new int[num5.length];
        int start=0,end=num5.length-1;
        mergeSortImpl(num5,start,end,temp);
    }

    private void mergeSortImpl(int[] num5, int start, int end, int[] temp) {
        if (start>=end)return;
        int mid=(start+end)/2;
        mergeSortImpl(num5,start,mid,temp);
        mergeSortImpl(num5,mid+1,end,temp);
        merge(num5,start,mid,end,temp);
    }

    private void merge(int[] num5, int start, int mid, int end, int[] temp) {

    }


    private void quickSort(int[] nums, int start, int end) {
        if(start>=end)return ;
        //中心点
        int pivot=nums[start];
        int left=start;
        int right=end;
        while (left<=right){
            while (left<=right && nums[left]<pivot){
                left++;
            }
            while (left<=right && nums[right]>pivot){
                right--;
            }
            if (left<=right){
                //交换位置
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;

                left++;
                right--;
            }
        }
        quickSort(nums,start,right);
        quickSort(nums,left,end);
    }

    //选择排序
    private int[] selectSort(int[] nums) {
        long start=System.currentTimeMillis();
        if (nums==null || nums.length==0) return null;
        for (int i=0;i<nums.length;i++){
            int pos=i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[pos]>nums[j]){
                    pos=j;
                }
            }
            if (pos!=i){
                int temp=nums[i];
                nums[pos]=nums[i];
                nums[i]=temp;
            }
        }
        System.out.println("selectSort:"+(System.currentTimeMillis()-start));
        return nums;
    }

    //插入排序
    private int[] insertSort(int[] nums) {
        long start=System.currentTimeMillis();
        if (nums==null || nums.length==0) return null;

        int j;
        int insertNode;
        for (int i=1;i<nums.length;i++){
            insertNode=nums[i];
            j=i-1;
            while (j>=0&& insertNode <nums[j]) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=insertNode;
        }
        System.out.println("insertSort:"+(System.currentTimeMillis()-start));
        return nums;
    }

    //生成随机数
    private static int[] genNums(int num) {
        int[] nums=new int[num];
        for (int i = 0; i < num; i++) {
            nums[i]=(int)(Math.random()*1000);
        }
        return nums;
    }

   //冒泡排序
    private int[] bubbleSort(int[] nums) {
        long start=System.currentTimeMillis();
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length-i;j++){
                if (nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println("bubbleSort:"+(System.currentTimeMillis()-start));
        return nums;
    }
}
