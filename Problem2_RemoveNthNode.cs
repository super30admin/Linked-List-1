// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Approach: The approach is to find the node to be removed using sliding window pattern and update the links between
// previous and next nodes of the node removed.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        //Using temp node if head node is to be removed.
        ListNode temp = new ListNode(-1, head);
        ListNode slow = temp;
        ListNode fast = temp;
        //Sliding window pattern -> create n nodes of difference between slow and fast pointers
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        //Then, move slow and fast pointers by 1 until the end of list 
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //Remove nth node from the end of the list
        ListNode node = slow.next;
        slow.next = node.next;
        node.next = null;

        return temp.next;
    }
}