// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)

// Time Complexity : 3-pointers - O(N)
// Space Complexity : 3-pointers - O(1)
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
    // In-place using 3-pointers
    // Time - O(N)
    // Space - O(1)
    private ListNode inPlace(ListNode head){
        // List length<=1
        if(head==null || head.next==null)   return head; 

        // Add a dummy node to handle edge cases
        ListNode dummy=null;

        ListNode prev=dummy;
        ListNode curr=head; 
        ListNode fast;

        while(curr!=null){
            fast=curr.next;

            // Reverse
            curr.next=prev;

            // Move pointers
            prev=curr;
            curr=fast;
        }

        return prev;
    }

    // Recursive version of 3-pointers
    // Time - O(N)
    // Space - O(N)
    private ListNode inPlaceRec(ListNode prev, ListNode curr){
        if(curr==null) return prev;

        ListNode fast=curr.next;
        curr.next=prev;

        return inPlaceRec(curr, fast);
    }

    // Recursive version using 1 param
    // Time - O(N)
    // Space - O(N)
    private ListNode inPlaceRec(ListNode curr){
        if(curr==null||curr.next==null) return curr;

        ListNode result=inPlaceRec(curr.next);
        curr.next.next=curr;
        curr.next=null;

        return result;
    }

    public ListNode reverseList(ListNode head) {
        //return inPlace(head);
        //return inPlaceRec(null, head);
        return inPlaceRec(head);
    }
}