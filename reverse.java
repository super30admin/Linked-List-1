// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // initialise the previous node to null
        ListNode NextNode = null;   // we need the next node from head, after we point the head node in other direction, we need to process further
        while(head != null){    // base condition to reach the end of the linked list
            NextNode = head.next ;  // next node to head is stored in temp node, i.e NextNode
            head.next = prev;   // head is not pointed in other direction 
            prev = head;        // this is for building the linkedlist in reverse order
            head = NextNode;    // to proceed further in the linkedList
        }
        
        return prev;
    }
}