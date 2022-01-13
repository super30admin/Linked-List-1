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
//TC: O(n)
//SC: O(1)
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        slow = head;
        fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}