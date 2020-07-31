// Time Complexity : O(n), n is the length of list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/* Using two pointers fast and slow, slow pointer moves one at a time and fast pointer moves two nodes at a time.
 * If slow and fast pointers meet, then we can say cycle is been detected.
 * By resetting the slow pointer to the head of list and 
 * moving both pointers one node at a time, both the pointers will meet at start of the cycle,return the node.*/

public class Linked_ListCycleII {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		boolean flag = false;

		while(fast != null && fast.next!= null){	
			slow = slow.next;
			fast = fast.next.next;	 // fast pointer moves 2 nodes at a time

			if(slow == fast){
				flag = true;	 //if we find a cycle, set flag=true
				break;
			}    
		}

		if(!flag)		//Can't check slow!=fast as for 1 node the loop wont execute and they will be equal
			return null;

		slow = head;	// reset slow to start of list
		while(slow != fast){
			// increase slow and fast pointer by one
			slow = slow.next;
			fast = fast.next;
		}

		return fast;	// return the position they meet i.e start of the cycle
	}
}
