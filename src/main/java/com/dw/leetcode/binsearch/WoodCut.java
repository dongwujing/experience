package com.dw.leetcode.binsearch;

public class WoodCut {
    public static void main(String[] args) {
        int[] l={232,124,456};
        int k=7;
        int segment=new WoodCut().cut(l,k);
        System.out.println(segment);
    }

    private int cut(int[] l, int k) {
        if (l==null || l.length==0) return 0;
        int start=1;
        int end=getMax(l);
        int mid;
        while (start+1<end){
            mid=start+(end-start)/2;
            int segment=getSegment(l,mid);
            if (segment>=k){
                start=mid;
            }else {
                end=mid;
            }
        }

        if (getSegment(l,end)>=k)return end;
        if (getSegment(l,start)>=k)return start;

        return 0;
    }

    private int getSegment(int[] l, int length) {
        int segment=0;
        for (int i : l) {
            segment+=i/length;
        }
        return segment;
    }

    private int getMax(int[] l) {
        int max=0;
        for (int i : l) {
            if (max<i){
                max=i;
            }
        }
        return max;
    }
}
