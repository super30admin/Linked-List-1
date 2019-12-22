// Time Complexity :
//    reverseList() - O(n) - we go through all nodes
//    recurse() - O(n) - we go through al the nodes to the end
//      
// Space Complexity :
//    additional - O(1) - we keep a seperate pointer as the new head for returning after the reversal
//    reverseList() - O(1)
//    recurse() - O(n)
//
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
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        else
        {
            recurse(head).next = head;
            head.next = null;
            return newHead;
        }
    }
    
    ListNode recurse(ListNode head)
    {
        if(head.next == null)
        {
            newHead = head;
            return head;
        }
        recurse(head.next).next = head;
        return head;
    }
}
