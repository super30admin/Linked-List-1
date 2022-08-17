// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Without the use of dummy node
 **/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        int count = 0;
        
        while (count < n) {
            fast = fast.next;
            count++;
        }
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // if fast is null --> means it is at the end and we have to remove the first element at head
        if (fast == null) {
            head = head.next;
            return head;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * With the use of dummy node before the head
 **/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        
        int count = 0;
        
        while (count < n) {
            fast = fast.next;
            count++;
        }
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummyNode.next;
    }
}