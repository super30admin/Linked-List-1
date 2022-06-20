// Time Complexity : O(N) (to find if there is cycle) + O(N) (to find the cycle start) = O(2N) = O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null) return head;

        // use fast and slow pointer
        // Move fast by 2 and slow by 1 place
        // In future if there is cycle they will overlap else fast will reach the null
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                flag = true;
                break;
            }

        }

        // check if there is cycle
        if (flag == false) return null;

        // If There is loop
        fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}