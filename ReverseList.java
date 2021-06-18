// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * 1. Idea is to insert null at the start and reverse the pointer.
 * 2. initiate prev as null ,cur as head.
 * 3. cur.next will be lost so take it to temp.
 * 4. change cur.next to prev, current as prev and temp as current node to process
 * 5. continue till you reach end of the list.
 */
public class ReverseList {

	public ListNode reverseList(ListNode head) {
		ListNode prev= null;
		ListNode cur=head;
		
		while(cur!=null) {
			ListNode temp= cur.next;
			cur.next = prev;
			prev= cur;
			cur= temp;
		}
		
		return prev;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
