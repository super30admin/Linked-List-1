// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach



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
    int length = 0; 
        ListNode curr = head;               // find the length of the linkedlist
        while(curr != null){
            length++;
            curr = curr.next;
        }
        
        if(length <= 1) return null;        // corner case - length is negative
        if (length == n) return head.next;  // length is 2 and the linkedlist has 2 nodes
        length = length -n;                 // subtract it
        int i =0;
        curr = head;                        //initialize curr to the first node
        while (i< length -1){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;         // skip the node
        return head;                        // return the head of the linkedlist
}
}