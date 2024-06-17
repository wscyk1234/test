package org.example.linkedList;

import java.util.List;

public class 回文链表 {
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
        ListNode d= new ListNode(2);
        ListNode o = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = o;

        Boolean ans = isPalindrome(a);
        System.out.println(ans);
        ListNode both = a;
        while (both != null){
            System.out.println(both.val);
            both = both.next;
        }
    }
    public static boolean isPalindrome(ListNode root){
        if (root == null || root.next == null) {
            return true;
        }
        ListNode slow = root;
        ListNode fast = root;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode cur = null;
        while (fast != null){
            cur = fast.next;
            fast.next = slow;
            slow = fast;
            fast = cur;
        }
        cur = slow;
        fast = root;
        boolean res = true;
        while (slow != null && fast != null){
            if (slow.val != fast.val){
                res = false;
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
        slow = cur.next;
        cur.next = null;
        while (slow != null){
            fast = slow.next;
            slow.next = cur;
            cur = slow;
            slow = fast;
        }
        return res;
    }
}
