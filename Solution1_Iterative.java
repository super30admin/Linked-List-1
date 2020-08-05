// Leetcode 206. Reverse Linked List
/** 3 Pointer Approach: 
 *  1. Take a prev node which will always point to previous node.
 *  2. curr node will point to current node, starting with HEAD.
 *  3. And a TEMPORARY node which will temporarily hold the value of current's next node, so that 
 *  we can modify current;s next by pointing it to previous node. 

 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

class Solution {
        public ListNode reverseList(ListNode head) {
            // 1 -> 2 -> 3-> null
            // null <- 1 <- 2 <- 3
            
            if(head == null || head.next== null) return head;
            
            ListNode prev = null;
            ListNode curr = head;
            ListNode temp = null;
          
     
            while(curr != null){
                temp = curr.next;       
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
          
           return prev;
        }
}