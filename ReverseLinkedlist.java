// Time Complexity :O(N) where n is the number of nodes 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Iterating through each node and removing it from head list and adding the
// next of the node to the result, which is initilly null. 
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
        if(head == null || head.next == null)
            return head;
        ListNode previous=null;
        ListNode current = head;
        while(head!=null){
            current = head.next;
            head.next=previous;
            previous=head;
            head=current;
        }
        return previous;
    }
}