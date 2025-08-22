// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We use floyds Algo. Once the cycle is detected, we move the slow pointer to the head and move both pointers one step at a time. The place of meeting is the starting point of the loop.
// This is because (a+b) [time taken by slow] = (a+b+c+b)/2 [time taken by fast]

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle){
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        return null;
    }
}