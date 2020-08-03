/**
 * Time Complexity: O(n) where n is the number of nodes in the linked list
 * Space Complexity: O(1)
 * Executed on leetcode: yes
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int len = 1;
        ListNode curr = head;
        if(head.next==null && n==1) return null; // edge case; where only one node is there and we need to delete that
        while(curr.next!=null) 
        {
            curr = curr.next;
            len++;
        }
        n = len - n; 
        if(n==0) return head.next; // edge case, where indirectly we are being asked to delete the first ndoe itself
        curr = head;
        for(int i=1;i<n;++i) curr = curr.next; //we are finding the node which is len-n places from the head so that we can link the node at len-n place to its next.next node to complete deletion
        curr.next = curr.next.next;
        return head;
        
        
    }
}
