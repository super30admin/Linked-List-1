/*
 * The complexity of the algorithm is O(n) where n is no of elements.
 * Space complexity is O(n) where n is no of elements.
 *  */

public class ReverseLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;
		
		
		   
        ListNode reverse= reverseList(head.next);
        
        head.next.next=head;
        head.next=null;
        
        return reverse;
//		ListNode pre = null;
//		ListNode fast = head.next;
//		ListNode curr = head;
//		while (fast != null) {
//
//			curr.next = pre;
//			pre = curr;
//			curr = fast;
//			fast = fast.next;
//
//		}
//
//		curr.next = pre;
//
//		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList objIn = new ReverseLinkedList();
				

	}

}
