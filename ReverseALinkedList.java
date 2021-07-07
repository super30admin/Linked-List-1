package s30Coding;

//Time Complexity :- O(n) where n is the length of the linkedList

//Space Complexity :- O(1) No extra space or stack used

//LeetCode : yes

public class ReverseALinkedList {
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 	}
	 
	    public ListNode reverseList(ListNode head) {
	    ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	}
}
