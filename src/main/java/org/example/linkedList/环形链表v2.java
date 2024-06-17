package org.example.linkedList;

public class 环形链表v2 {
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

        ListNode ans = detectCycle(a);
        if (ans != null){
            System.out.println(ans.val);
        }else {
            System.out.println("不是环形链表");
        }
    }
    public static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                while (slow != head){
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }
        }
        return null;
    }
}
