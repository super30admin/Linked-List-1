// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We use slow and fast pointers as 1x and 2x speed respectively and run a loop till fast != null && fast.next != null, && operator will not check the second part
 * if slow meets fast we know there is cycle and the we reset fast to head and move them at same speed 1x till they meet again
 * and that point is start of the cycle.
 */
class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle) {
            return null;
        }
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
