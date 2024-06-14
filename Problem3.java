/*
    LC - 142. Linked List Cycle II
    TC - o(n)
    SC - o(1)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break; // stopping conditions
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