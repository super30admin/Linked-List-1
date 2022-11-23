// Time Complexity : O(n)
// Space Complexity : O(1) if using three pointers , O(n) if using recursion as stack will build up
// Did this code successfully run on Leetcode : yes

package com.madhurima;

public class ReversedLinkedList {
}

//using three pointers
class SolutionC1 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        curr.next = prev;

        return curr;
    }
}

//using recursion
class SolutionC2 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
