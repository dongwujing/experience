package com.dw.leetcode.queue;

import java.util.*;

public class KuaiShouEx2 {
    public static void main(String[] args) {
        List<String > vpList=new ArrayList<>();
        vpList.add("v0");
        vpList.add("v1");
        vpList.add("v2");
        vpList.add("p3");
        vpList.add("p4");
        vpList.add("p5");
        vpList.add("v6");
        vpList.add("v7");
        vpList.add("v8");
        vpList.add("v9");

        List<String > result=new KuaiShouEx2().getRecommendedResult(vpList,4);
        System.out.println(result.toString());
    }

    private List<String> getRecommendedResult(List<String> vpList, int maxInterval) {
        List<String> result=new ArrayList<>();
        if (vpList.isEmpty() || vpList==null) return result;

        Queue<String> vQueue=new LinkedList<>();
        Queue<String> pQueue=new LinkedList<>();
        boolean firstPic=false;
        int index=0;
        int pvsize=vpList.size();

        if (!firstPic && index<pvsize){
            if (isVideo(vpList.get(index))){
                result.add(index,vpList.get(index));
                index++;
            }else {
                firstPic=true;
            }
        }
        //放入队列
        while (index<pvsize){
            if (isVideo(vpList.get(index))){
                vQueue.add(vpList.get(index));
            }else {
                pQueue.add(vpList.get(index));
            }
            index++;
        }
        int currentSize=result.size();
        while (!vQueue.isEmpty() && !pQueue.isEmpty()){
            if (currentSize>=maxInterval){
                result.add(pQueue.poll());
                currentSize=0;
            }else {
                result.add(vQueue.poll());
                currentSize++;
            }
        }

        while (!vQueue.isEmpty()){
            result.add(vQueue.poll());
        }

        if (currentSize>maxInterval && !pQueue.isEmpty()){
            result.add(pQueue.poll());
        }
        return result;
    }

    private boolean isVideo(String s) {
        return s.indexOf("v")!=-1;
    }
}
