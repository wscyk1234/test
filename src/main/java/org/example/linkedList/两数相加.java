package org.example.linkedList;

import java.util.List;

public class 两数相加 {
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
        ListNode e = new ListNode(1);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(3);
        ListNode h= new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = o;

        e.next = f;
        f.next = g;
        g.next = h;

        ListNode ans = addTwoNumbers(a,e);
        while (ans != null){
            System.out.println(ans.val);
        }
    }
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        return l1;
    }
}
