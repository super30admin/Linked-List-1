# Linked-List-1

## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
1. To reverse a Linked List I will be using a prev node at which my curr node's next will point
2. At the start my prev will be null

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = prev;
            prev = curr;
            curr = curr.next;
            prev.next = temp;
        }
        
        return prev;
    }
}

## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
1. we will first move the fast pointer n steps so that there is always a gap of n nodes bw slow and fast
2. and once the fast pointer reaches the last node our slow pointer will be right before the node we want to delete
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Step 1: Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Step 2: Move fast and slow one step at a time
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Skip the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}

## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

1. check if there is a cycle in the LL or not 
2. If there is no cycle return null
3. else there is a cycle :-
        //fast has travelled x+y n(y+z) {where n = number of loops fast had to complete before meeting slow}
        //slow has travelled x+y
        //x+y n(y+z) = 2*(x+y) => (n-1)y + nz = x
        //so now if we will keep the fast pointer at the start of the LL then both slow and fast will travel a distance to reach at the start of the LL. Hence, x = z

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        boolean cycle = false;

        // First, detect cycle
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }

        // No cycle
        if(!cycle){
            return null;
        }

        // Move one pointer to head and find start of cycle
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}