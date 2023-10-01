                           // Reverse Linked List

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode low = null;
        ListNode mid = head;
        ListNode high = head.next;

        while(high != null){
            mid.next = low;
            low = mid;
            mid = high;
            high = high.next;
        }
        mid.next = low;
        return mid;
    }
}

                           // Remove Nth Node from End

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        // dummy is required for cases where head itself is removed
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast != null && slow != null){
            if(len > n){
                slow = slow.next;
            }
            fast = fast.next;
            len++;
        }
        if(slow.next == null)
            return null;
        slow.next = slow.next.next;
        return dummy.next;
    }
}

                           // Linked List Cycle II

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        if(slow != fast)
            return null;
        
        while(slow != null && head != null && slow != head){
            slow = slow.next;
            head = head.next;
        }

        return head;

    }
}
