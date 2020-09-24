package com.dw.leetcode.addtwonums;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        if (l1 == null) {
            return l2;
        }
        if (l2==null){
            return l1;
        }

        int carry=0;
        ListNode head=new ListNode(-1);
        ListNode pre=head;

        while (l1!=null && l2!=null){
            int num= l1.val+l2.val+carry;
            carry=num/10;
            ListNode node=new ListNode(num%10);
            pre.next=node;

            pre=pre.next;
            l1=l1.next;
            l2=l2.next;
        }

        while (l1!=null){
            int num=l1.val+carry;
            carry=num/10;
            ListNode node=new ListNode(num%10);
            pre.next=node;

            pre=pre.next;
            l1=l1.next;
        }

        while (l2!=null){
            int num=l2.val+carry;
            carry=num/10;
            ListNode node=new ListNode(num%10);
            pre.next=node;

            pre=pre.next;
            l2=l2.next;
        }

        if (carry!=0){
            pre.next=new ListNode(carry);
        }

        return head.next;
    }
}
