package com.dw.leetcode.reverselist;

/**
 * 反转单向链表
 */
public class Solution {
    public ListNode reverserList(ListNode head){
        if (head==null){
            return null;
        }
        ListNode prev=head;
        ListNode current=head.next;
        prev.next=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;

            prev=current;
            current=next;

        }
        return prev;
    }
}
