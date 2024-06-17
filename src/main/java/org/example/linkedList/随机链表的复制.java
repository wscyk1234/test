package org.example.linkedList;

import java.util.List;

public class 随机链表的复制 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode random;
        ListNode(int x){
            val = x;
            next = null;
            random = null;
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

        ListNode ans = copyRandomList(a);
        if (ans != null){
            System.out.println(ans.val);
        }else {
            System.out.println("不是环形链表");
        }
    }
    public static ListNode copyRandomList(ListNode head){
        return head;
    }
}
