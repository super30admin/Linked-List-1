// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * 1. Create slow and fast pointer and find is cycle exist
 * 2. when cycle found move slow pointer to head.
 * 3. move slow and fast pointer one step.
 * 4. when slow and fast pointers meet thats the head of the cycle.
 */
public class DetectcyclicHead {

	public ListNode detectCycle(ListNode head) {

		ListNode slowp = head;
		ListNode fastp = head;

		boolean isCyclic = false;
		while (fastp != null && fastp.next != null) {
			fastp = fastp.next.next;
			slowp = slowp.next;
			if (fastp == slowp) {
				isCyclic = true;
				break;
			}
		}

		if (isCyclic) {
			slowp = head;
			while (slowp != fastp) {
				fastp = fastp.next;
				slowp = slowp.next;
			}
			return slowp;
		} else {
			return null;
		}

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
