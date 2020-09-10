// TC: O(N) where N represents nodes in the list
// SC:O(n) since we are traversing the all the nodes in the list and the data is stored in recursion stack

// We are keeping track of previous element and the current element, we swap the previous and curr element. SImilarly we repeat swapping the previous element
// and update the previous and current element.
public class ReverseLL {
	
	public ListNode Reverse(ListNode head) {
		
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	public ListNode ReverseRecursion(ListNode head) {
		
		if(head==null || head.next==null)
			return head;
		
		ListNode node = ReverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return node;
				
	}
	
	public static void main(String[] args) {
		ReverseLL reverse = new ReverseLL();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode res = reverse.ReverseRecursion(head);
		while(res!=null)
		{	
			System.out.println(res.data);
			res = res.next;
			
		}
	}

}
