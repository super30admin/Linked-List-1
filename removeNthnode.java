// Time Complexity : o(L) L is length of list
// Space Complexity : o(1) not using extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


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
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        int length = 0;
        ListNode first = head;
       
        while(first != null){
            length++;
            first = first.next;
        }
        
        // remove L-n+1 th node from the list
        length = length-n;
        first = dummy;
        while(length > 0){
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
        
        
    }
}