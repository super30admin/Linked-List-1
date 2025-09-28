/*
TC: O(n) n: no of nodes in the list.
SC: O(1)
Approach 1(with extra space): 1 pass to get the size of the list, then 2nd pass to reach the node just before the nth node, start from start and keep on decrementing the size, as soon as size == n , break the loop. update the next of head to next.next. at the end return the res.next.
Approach 2(No extra space): Create two pointers, res and ptr, res to keep the reference of the head to return and ptr to reach the end of tje list. move your ptr to the nth postion from front of the list. Now move both head and ptr until ptr is null which implies that ptr is at the last node of the list and head is just before the nth node from the end. just update the next of head to next.next. At the end, return res.next.
*/

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
       	ListNode res = new ListNode(0);
        res.next = head;
	    ListNode ptr = res;
        ListNode ptr2 = res;
	
	while(n != -1){
		ptr = ptr.next;
		n--;
	}
	
	while(ptr != null){
		ptr = ptr.next;
		ptr2 = ptr2.next;
	}
	
	ptr2.next = ptr2.next.next;
	
	return res.next;

    }
}