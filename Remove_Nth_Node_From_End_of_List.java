// Time Complexity : O(n), We traverse oncethrough the tree.
// Space Complexity : O(1), No extra space is created.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: This is one pass algorithm where first we
kept distance between 2 new dones as n by moving only the fast pointer. Then we moved both the pointers by 1 until 
we reached end of linked list. Then slow pointer was pinted to the next.next node to skip the required noe to be skipped.
Then we returned prev.next for the answe 

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
        if(head==null)return head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode slow = prev;
        ListNode fast = prev;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return prev.next;
    }
    
}