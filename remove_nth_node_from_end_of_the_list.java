// Time Complexity : O(n), where n is the number od nodes in the linkedlist
// Space Complexity :O(n), no extra space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation in plain english
//1. create a dummy node, whos next points to the head and place your slow and fast pointers at this dummy node
//2. First only move your fast pointer till it reaches to n, and then move both slow and fast pointer till fast's next becomes null
//3. This way the slow is one element before the element to be removed. Make your necessary connections and return the dummy's next
        //as the dummy's next holds the linkedlist

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
        //create a dummy node, whos next points to head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        //place slow and fast at the dummy node (that is one node ahead of head)
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        //place the fast pointer at nth node in the Linkedlist
        while(count<n ){
            fast = fast.next;
            count++;
        }
        
        //move both slow and fast till fast's next is null
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //slow is at one element before the element to be removed, so make the new connections
        slow.next = slow.next.next;
        
        //dummy's next holdds the linked list
        return dummy.next;
    }
}