// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A

// Your code here along with comments explaining your approach
// Used slow and fast pointers to detect a cycle
// When fast or fast.next reaches null that means there is no cycle otherwise both slow and fast will meet
// Now start slow from head and fast from the position where they both met
// here they will meet at the start of cycle

public class linkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

}
