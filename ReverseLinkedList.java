/**

    Approach: LinkedList traversal

    Time Complexity: O(n)
    Space Complexity: O(1)

 */

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
    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return null;
        }


        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;


        while(currentNode != null) {

            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}