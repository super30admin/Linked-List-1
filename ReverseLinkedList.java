/**
Time:O(N) space:O(1) for iterative and O(N) stack space for recursive solution
Algorithm:
=========
1. Use 3 pointers to keep track of the list we have changed so far, node currently being processed and the beginning of list yet to
be processed.
2. Move them till to be processed list is done
 */
// ======================== Recursion ==============================
//Time: O(N), Space: O(N) recursive stack space
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;			// edge case
        ListNode newHead = reverseList(head.next);					// recurse and push all nodes to stack till tail
        
        head.next.next = head; 										// For every node, point its next's next to itself and makes its next null
        head.next = null;
        
        return newHead;
    }
}

// ======================== Iterative ==============================
class Solution {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) return head;			// edge
		ListNode prev = null, curr = head, fast = head.next;		//using 3 pointers, two to keep track of forming connections in reverse
		while(fast != null) {										// 1 to keep track of remaining list to be reversed 
			curr.next = prev;										
			prev = curr;
			curr = fast;
			fast = fast.next;
		}
		curr.next = prev;
		return curr;											// return head of reversed list

	}
}
