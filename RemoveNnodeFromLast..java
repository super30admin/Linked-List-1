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
        // Time Complexity : O(No. of list nodes )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
1. Maintaiin dummy node at the start to avoid the case where nth node from last is first node.
2.Travel till the prev of node to be removed.
*/
        
        if(head == null) return null;
            
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        dummy.next = head;
        int l = 0;
        while(head != null){
            l++;
            head = head.next;   
        }
        int k = l-n+1;
        head = temp;
        while(k>1){
            head = head.next;
            k--;
        }
        head.next = head.next.next;
        return dummy.next;
        
    }
}