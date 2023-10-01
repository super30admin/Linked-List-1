/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Check if the head of the linked list is null
        if(head == null)
            return head;

        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        // Move the fast pointer n steps ahead
        while(count <= n){
            fast = fast.next;
            count++;
        }

        // Move both slow and fast pointers until fast reaches the end
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end by adjusting pointers
        slow.next = slow.next.next;

        // Return the updated head of the linked list
        return dummy.next;
    }
}

//Time Complexity: O(N), where N is the number of nodes in the linked list.
//Space Complexity: O(1), since we are using a constant amount of extra space regardless of the input size.
