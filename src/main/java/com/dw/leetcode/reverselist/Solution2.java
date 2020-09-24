package com.dw.leetcode.reverselist;

/**
 * 反转单向链表2 指定区间
 */
public class Solution2 {
    public ListNode reverserBetween(ListNode head,int m,int n){
        if (head==null || m>=n){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        head=dummy;

        for (int i=1;i<m;i++){
            head=head.next;
        }

        ListNode prevM=head;
        ListNode currentM=head.next;
        ListNode currentN=currentM;
        ListNode postN=currentN.next;

        for (int i=m;i<n;i++){
            ListNode next=postN.next;
            postN.next=currentN;

            currentN=postN;
            postN=next;
        }

        currentM.next=postN;
        prevM.next=currentN;


        return dummy.next;
    }
}
