// TC - O(n), SC - O(1)
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
    public ListNode reverseList(ListNode head) {
        // Initializing two new listnodes temp and prev and assigning them to head and null respectively
        ListNode temp = head;
        ListNode prev = null;
        // Iterate till temp is not null
        while(temp != null){
            // Create a new listnode with current temp listnode
            ListNode newHead = new ListNode(temp.val);
            // prev has all the reversed list so far, newHead.next will be prev and prev will be newHead
            newHead.next = prev;
            prev = newHead;
            // temp = temp.next
            temp = temp.next;
        }
        // return prev which will have all the reversed linked list
        return prev;
    }
}