package org.example.linkedList;

public class 删除链表的倒数第n个结点 {
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
        int n = 1;

        ListNode ans = removeNthFromEnd(a,1);
        if (ans != null){
            System.out.println(ans.val);
        }else {
            System.out.println("不是环形链表");
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        return head;
    }
}
