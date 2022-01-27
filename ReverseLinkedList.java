// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
    public ListNode reverseList(ListNode head) {
        
        ListNode newHead = null; //dummy node
        while(head != null){
            
            ListNode next = head.next; //next node -- took next and pointed it to immediate next of head
            head.next = newHead; //breaking link btw next node and pointing to dummy node
            newHead = head; //move our dummy node to the head
            head = next; //move our head to next
            
        }
        
        return newHead;
    }
}