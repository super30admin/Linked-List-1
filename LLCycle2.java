// TC: O(N) where N represents the nodes in the Linked list
// SC: O(1) since it runs with constant space memory

// We keep a fast and a slow pointer. fast pointer will be moving 2 times the slow pointer, if the loop exists, they meet at a point. We will return either fast/slow pointer
// Now we need to check where the actualy loop starts. So for this we need to keep a pointer at the start of the Linked list and other pointer will point to the inersection point
// we got from checking the loop. We will move through the linked list until the start pointer and intersection pointer meet. If they meet we know that
// this is the starting point and we return that pointer.

public class LLCycle2 {

	public ListNode CycleLL(ListNode head) {
		
		if(head==null)
			return null;
		
		ListNode intersect = getIntersect(head);
		if(intersect==null)
			return null;
		
		ListNode p1 = head;
		ListNode p2 = intersect;
		
		while(p1!=p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	public ListNode getIntersect(ListNode head) {
		
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast==slow)
				return slow;
		}
		return null;
	}
}
