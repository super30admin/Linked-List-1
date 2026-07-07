// Time complexity: O(n)
// Space complexity: O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                flag = true;
                break;
            }
        }

        if(!flag) {
            return null;
        }

        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}