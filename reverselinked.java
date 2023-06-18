// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// We are using 3 pointer prev, curr and fast which are pointer to null , head,head.next respectively. 
// prev - null , curr - 1 st element , fast = 2nd element.
// as we need to reverse the linked lsit curr.next which is pointing to 2nd element we need to make it to point towards null 
    // curr.next=prev;
// now we need to make the 1st element as prev 
    // prev=curr
// we need to make the 2nd element as curr but curr.next is already pointing towards the prev element. so use the fast pointer.
    // curr=fast;
// and move fast to next element 
    // fast=fast.next;
// as fast will be reaching the end of list first we can use a while loop to iterate through the linked list 
// when fast is null curr is at the last element whose next pointer is pointing towards null we need to change it to prev;

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
        if(head ==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        while(fast!=null){
            curr.next = prev;
            prev= curr;
           // curr.next=null;
            curr = fast;
            fast= fast.next;
        }
        curr.next=prev;
        return curr;
    }
}