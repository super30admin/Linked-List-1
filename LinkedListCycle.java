// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class LinkedListCycle {
    public ListNode detectCycle(Listnode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }
        
        if (!flag) return null;
        fast = head;
        while (slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
