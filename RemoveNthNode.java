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
//Approach: Move fast until n to create n distance and now traverse until end of the linked list at 1x time move for each slow and fast pointer
// As soon as fast reaches the end of the linked list, slow would be at the position where we need to remove the node

//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = head;
        int count = 0;

        //Create distance between slow and fast pointer around n
        while (count < n){
            fast = fast.next;
            count++;
        }

        ListNode slow = dummy;

        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        //Skip the node to delete it fromt he linked list
        slow.next = slow.next.next;

        return dummy.next;

    }
}