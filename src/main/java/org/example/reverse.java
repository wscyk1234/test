package org.example;

public class reverse {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static ListNode reverse(ListNode headA){
        ListNode pre = null;
        ListNode cur = headA;
        while (cur != null){
            ListNode ans = cur.next;
            cur.next = pre;
            pre = cur;
            cur = ans;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(13);
        ListNode d= new ListNode(21);
        ListNode o = new ListNode(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = o;

        ListNode both = reverse(a);
        while (both != null){
            System.out.println(both.val);
            both = both.next;
        }
    }
}
