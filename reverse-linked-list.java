// Time Complexity : 
O(n) where n is number of elements in linked list
// Space Complexity :
O(1) as we are just using the pointers
// Did this code successfully run on Leetcode :
Yes
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
    public ListNode reverseList(ListNode head) {
         //Basecase(size 0 and size 1)
        if(head == null || head.next == null) return head;
        //maintain three pointers
        
        //Pointer 1
         ListNode previous = null;
         //Pointer 2 which is at the current element
         ListNode current = head;
        /*Pointer 3 which is used to point to the element at any point where the link is reversed*/
        
        ListNode forward = null;
        
        while(current != null){
            forward = current.next;//back up
            current.next = previous ; //Link
            previous = current;
            current = forward;
            
        }
        
        return previous;
    }
}