/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//TC: O(N) SC: O(1)
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null) { //handling for both even and odd numbered linked list
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // can return slow or fast since both are at same place
        
    }
}
