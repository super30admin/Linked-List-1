/**
 * Definition for singly-linked list.
*/
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code run on Leetcode successfully? : Yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while(n > 0) {
            ptr2 = ptr2.next;
            n -= 1;

            if(ptr2 == null && n > 0) {
                return null;
            }
        }

        while(ptr2 != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        prev.next = ptr1.next;
        ptr1.next = null;

        return dummy.next;
    }
}