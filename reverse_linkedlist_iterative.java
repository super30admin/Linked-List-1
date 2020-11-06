// Time Complexity :O(n), where n is the number of the nodes in the Linkedlist
// Space Complexity :O(1), no extra space used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

//Three Liner explanation your code in plain english
//1. Take 3 pointer, one at previous node, one at current and one at the next node (because after changing the current's next, you 
        // the reference to the actual next node in the original list
//2. At every step, assign previous to the current's next and then move forward by making previous as current, current as fast(next)
        // and fast(next) as fast.next
//3. Continue doing this till fast(next) reaches null. At this point you are still left to assign last current's next as prev, so do that 

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
        //return head, if it is null or is only a single node in the Linkedlist
        if(head == null || head.next == null) return head;
        
        //take 3 pointers
        //one at previous node, one at current and one at the next node
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head.next;
        
        //keep making current's next as previous till fast reaches null
        while(fast != null){
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }
        
        //after fast reaches null, the last node's next is not updated, so updating
        current.next = prev;
        
        //current holds the reverse linkedlist
        return current;
    }
}