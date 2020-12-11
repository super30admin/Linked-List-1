/** Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
* TC O(N) SC O(1)
* Code submitted on leetcode
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean cycleExists = false;
        if (head == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }
        if (cycleExists) {
            slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
