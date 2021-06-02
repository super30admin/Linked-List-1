package LinkedList1;

/*Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
Source Link: https://leetcode.com/problems/reverse-linked-list/
     -------------------------------------------------------------------------------------------------------
      Time complexity : o(n) 
      space complexity: o(1) 
      Did this code run successfully in leetcode : yes
      problems faces : No
  */
public class ReverseinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode previousNode = new ListNode(head.val);
        ListNode currentNode = head.next;

        while (currentNode != null) {
            ListNode newNode = new ListNode(currentNode.val);
            newNode.next = previousNode;
            previousNode = newNode;
            currentNode = currentNode.next;
        }

        return previousNode;

    }

}
