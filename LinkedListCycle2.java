//https://leetcode.com/problems/linked-list-cycle-ii/
/*
Time: O(n) where n is the number of nodes in the input
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) // Note
        {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }

        return null;

    }

}
