// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Not really

	public class Solution2 {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head == null) {
	            return null;
	        }
	        int count = n;
	        ListNode dummy = new ListNode(-1, head);
	        ListNode temp = dummy;

	        while(temp != null && count >= 0) {
	            count--;
	            temp = temp.next;
	        }

	        ListNode start = dummy;

	        while(temp != null) {
	            temp = temp.next;
	            start = start.next;
	        }

	        if(start.next != null) {
	            start.next = start.next.next;
	        }

	        return dummy.next;
	    }

	    //Definition for singly-linked list.
	    public class ListNode {
	        int val;
	        ListNode next;
	        ListNode() {}
	        ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    }
	}