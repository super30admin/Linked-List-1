// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// It can be possible that we can remove head also so we are creating a dummy node -1 and pointer slow and fast at temp.
// to remove the nth element from end we need a pointer at one element before so that we can make the next pointer of the prev
// elemnt to point at next.next 
// to do it we move fast pointer n times
// so that we have n elements difference b/w slow and fast 
// from then we move slow and fast pointer by one element
// when the fast reaches null the slow pointer is at our required position. then we make slow.next as slow.next.next
// we need to return temp.next as head can be deleted  


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
        if(head == null || head.next == null) return null;
        ListNode temp = new ListNode(-1);
        temp.next=head;
        ListNode slow= temp;
        ListNode fast = temp;
        int count=0;
        while(count<=n)
        {
            fast=fast.next;
            count++;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return temp.next;
    } 
} 