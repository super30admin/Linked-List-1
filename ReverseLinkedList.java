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
class ReverseLinkedList {
    
    // Time Complexity: O(n) (where n -> no. of nodes in the linked list)
    // Space Complexity: O(1)
    
    public ListNode reverseList(ListNode head) {
        // Edge Case Checking
        if(head == null)
            return head;

        /*
            While traversing the list from left to right, we flip the direction by assigning the node to its previous thereby reversing the list in one pass. Initially, the previous node is null.
        */
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}