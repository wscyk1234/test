package org.example.linkedList;

import java.util.List;

public class 两两交换链表中的结点 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d= new ListNode(4);
        ListNode o = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = o;

        ListNode ans = swapPairs(a);
        while (ans != null){
            System.out.println(ans.val);
        }
    }
    public static ListNode swapPairs(ListNode head){
        return head;
    }
}
