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

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//use 2 pointers one fast and one slow, slow one starts after fst one traversed through given n n nodes, by the 
//time fast reaches end slow would be in the correct position to remove the next node, use dummy to see edge cases like
//deleting the first node
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0,j=0;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy, fast=dummy;
        while(j<n+1){
            fast=fast.next;
            j++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}