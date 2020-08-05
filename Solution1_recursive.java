// Leetcode 206. Reverse Linked List
/** 3 Pointer Approach: 
 *  1. recurse over head.next;
 *  2. and keep the base condition as => head or head.next as null
 *  3. This will not allow the last Node to enter in Recursive Stack and the last 
 *  recursion will return the last node and will keep returing that in all cals.
 * 4. Also will modify head(current node) next node's next with head and will make the head.next connection Null.

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
       
        if(head == null || head.next== null) return head;          
        ListNode r  = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;  
        return r;
    }
}