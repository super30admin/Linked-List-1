//Time Complexity : O(n)
//Space Complexity : O(1)

//Leeetcode : https://leetcode.com/problems/reverse-linked-list/

/**
 * Reverses a singly linked list.
 * The reverseList method iteratively reverts the direction of the next pointers in the list.
 * It returns the new head of the reversed list.
 */
public class ReverseLinkedList {
    
 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode prev = null;

        while(curNode != null) {
            ListNode temp = curNode.next;
            curNode.next = prev; 
            prev = curNode;
            curNode = temp;
        }
        return prev;
    }
}
