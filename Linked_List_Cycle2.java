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
public class Solution {
    //Time O(N)
    //Space O(1)
    public ListNode detectCycle(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode slow = head , fast = head;
        while();
        if(slow == null)
        {
            return null;
        }
         slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}