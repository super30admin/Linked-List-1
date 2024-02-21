// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Approach: The intution is to use 3 pointers which points to current node, its previous node and its next node,
// and update the link of current node to previous node so that the link is reversed.
 
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
    public ListNode ReverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = null; //pointer to previous node
        ListNode temp; //pointer to next node

        while(head != null) {
            temp = head.next;
            head.next = prev; //change the link of head from next node to previous node.
            prev = head; //move the prev pointer
            head = temp; //move head pointer
        }
        return prev;
    }
}