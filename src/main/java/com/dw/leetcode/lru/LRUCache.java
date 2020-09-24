package com.dw.leetcode.lru;


import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private class CacheNode{
        CacheNode prev;
        CacheNode next;
        int key;
        int val;

        public CacheNode( int key, int val) {
            this.prev = null;
            this.next = null;
            this.key = key;
            this.val = val;
        }
    }

    private int cap;
    private Map<Integer,CacheNode> map=new HashMap<>();
    private CacheNode head=new CacheNode(-1,-1);
    private CacheNode tail=new CacheNode(-1,-1);

    public LRUCache(int cap) {
        this.cap = cap;
        tail.prev=head;
        head.next=tail;
    }

    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }

        CacheNode current = map.get(key);
        current.prev.next=current.next;
        current.next.prev=current.prev;

        moveToTail(current);
        return current.val;
    }

    private void moveToTail(CacheNode current) {
        current.prev=tail.prev;
        tail.prev=current;

        current.prev.next=current;
        current.next=tail;

    }

    public void  put(int key,int val){
        if (get(key)!=-1){
            map.get(key).val=val;
            return;
        }

        if (map.size()==cap){
            map.remove(head.next.key);
            head.next=head.next.next;
            head.next.prev=head;
        }

        CacheNode insertNode=new CacheNode(key,val);
        map.put(key,insertNode);
        moveToTail(insertNode);

    }
}
