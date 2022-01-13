// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        
        for(int i=0; i<n; i++)
            currentNode = currentNode.next;
        
        if(currentNode == null)
            return head.next;
        
        ListNode removeNode = head;
        
        while(currentNode.next != null){
            removeNode = removeNode.next;
            currentNode = currentNode.next;
        }
        
        removeNode.next = removeNode.next.next;
        
        return head;
    }
}
