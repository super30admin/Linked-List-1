//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode ahead = null;
        
//         while(curr != null)
//         {
//             ahead = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = ahead;
//         }
//         return prev;
    }
}
