// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**Approach : start from head and move ahead and change pointers from
 * next to prev node, return last node which will be head of reversed list
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 *
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {

		if(head==null || head.next==null)
			return head;

		ListNode curr = head, newHead=null, prev=null;

		while(curr!=null)
		{
			ListNode temp = curr;
			curr = curr.next;
			temp.next = prev;
			prev = temp;
		}

		return prev;
	}
}
