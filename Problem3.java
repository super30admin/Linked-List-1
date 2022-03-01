// Time Complexity : O(n) where n is # nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: maintain a slow and fast pointer. Increment fast by 2 which gives a point
// when both slow and fast standing at same node. Then take 2 temp pointers, one from head
// the other from slow/fast, increment them and when they meet, we get the point where cycle starts


// Definition for singly-linked list.

class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                break;
            }
        }
        
        // no cycle
        if (fast == null || fast.next == null) {
            return null;
        }
        
        // cycle exists
        ListNode x = head;
        ListNode y = slow; // or fast;
        
        while(x != y) {
            x = x.next;
            y = y.next;
        }
        
        return x;
    }
}