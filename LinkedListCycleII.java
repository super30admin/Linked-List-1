// TC: O(n)
// SC: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode slow, fast, intersect;
        slow = head;
        fast = head;
        intersect = null;
        // find the intersect
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                intersect = slow;
                break;
            }
        }
        if(intersect == null) {
            return null;
        }
        ListNode curr = head;
        while(intersect != curr) {
            curr = curr.next;
            intersect = intersect.next;
        }
        return intersect;
    }
}