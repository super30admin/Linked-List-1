
//Time complexity: O(N)
//Space Complexity: O(1)
public class solution2 {
	public ListNode reverse(ListNode head) {
		 if (head == null || head.next == null) return head;
	        ListNode reverseNode = reverseList(head.next);
	        System.out.println(reverseNode.val);
	        head.next.next = head;
	        head.next = null;
	        return reverseNode;
	    }
}
