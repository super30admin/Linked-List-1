// Time Complexity : O(n) where n is the length of the linkedList
// Space Complexity : O(1) No extra space or stack used
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
//    <---Iterative--->
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;  
        while(head != null){
            ListNode next_node = head.next;            
            head.next = prev;
            prev = head;
            head = next_node;    
        }
        return prev;
    }
    
//    <----Recursive solution---->
        
    public ListNode reverseList(ListNode head) {
        
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode prev) {
        if (head == null)
            return prev;
        ListNode next = head.next;
        head.next = prev;
        return reverseListInt(next, head);
    }
  }
