// TC: O(n)
// SC: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow, fast;
        fast = head;
        slow = head;
        boolean flag = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                flag = true;
                break;
            }
        }
        if(flag == false) {
            return null;
        }
        fast = head;
        while(slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}