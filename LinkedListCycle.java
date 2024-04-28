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
// Time Complexity : O(N), N is the length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
       
    }
}