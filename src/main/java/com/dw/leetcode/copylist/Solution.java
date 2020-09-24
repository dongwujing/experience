package com.dw.leetcode.copylist;

public class Solution {
    public Node copyRandomList(Node head){

        if (head==null){
            return null;
        }

        copyHead(head);
        copyRandom(head);
        return spilt(head);
    }

    private Node spilt(Node head) {
        Node result=head.next;
        Node move= head.next;
        while (head!=null&& head.next!=null){
            head.next=head.next.next;
            head=head.next;
            if (move!=null && move.next!=null){
                move.next=move.next.next;
                move=move.next;
            }
        }
        return result;
    }

    private void copyRandom(Node head) {
        Node node=head;
        while (node!=null && node.next!=null){
            if (node.random!=null){
                node.next.random=node.random.next;
            }
            node=node.next.next;
        }
    }

    private void copyHead(Node head) {
        Node node=head;
        while (node!=null){
            Node copy=new Node(node.val);
            copy.next=node.next;
            node.next=copy;

            node=copy.next;
        }
    }



}
