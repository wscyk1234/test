package org.example;


public class getIntersectionNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public  static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int count = 0;
        ListNode big = headA;
        ListNode small = headB;
        while (big != null){
            count++;
            big = big.next;
        }
        while (small != null){
            count--;
            small = small.next;
        }
        if (count < 0){
            big = headB;
            small = headA;
        }else {
            big = headA;
            small = headB;
        }
        count = Math.abs(count);
        while (count > 0){
            big = big.next;
            count--;
        }
        while (small != null){
            if (big.val == small.val){
                return big;
            }
            big = big.next;
            small = small.next;
        }


        return new ListNode(-1);
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(13);
        ListNode d= new ListNode(21);
        ListNode e = new ListNode(14);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(5);
        ListNode h = new ListNode(6);
        ListNode o = new ListNode(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = o;

        e.next = f;
        f.next = g;
        g.next = h;
        h.next = o;
        ListNode both = getIntersectionNode(a,e);
        System.out.println(both.val);
    }
}
