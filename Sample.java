// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    
           
        ListNode curr= head;
        ListNode next= null;
        ListNode prev = null;
        
        while(curr!=null){
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        
      //the following lines take care of the condition when Linked List is empty
        head = prev;
        return head;
    
    }
}
