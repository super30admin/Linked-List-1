// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class ReverseLinkedList {

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

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode prev = null;
		ListNode curr = head;
		ListNode pred = head.next;

		while (pred != null) {
			// point curr node next to prev
			curr.next = prev;
			//set curr as prev for next iteration
			prev = curr;
			//curr as pred for next iteration
			curr = pred;
			//and pred to next
			pred = pred.next;
		}
		//as pred will be null , we will come out to the while loop. So, point last current to prev
		curr.next = prev;
		return curr;
	}
	
//	public ListNode reverseList(ListNode head) {
//		 if(head == null || head.next == null) return head;
		 // st.push until head.next == null. So stack will have all the nodes except last and 
		//reversed always point to last node
//	     ListNode reversed = reverseList(head.next);
//	     //remember - st.pop()
//	     head.next.next = head;
//	     head.next = null;
//	     
//	     return reversed;
//	}

}
