// TC: O(N) where N represents the elements in List. and we are travrsing the list only once.
// SC: O(1) since we are using constant space

// We are keeping 2 pointers, one which will move till nth node and second which will start from head. First node will be at nth position and second node will be at
// start pointing of list. Once the first node moves till end of the list. second will move till last nth node. once we have the position previous to the node to be deleted
// we will assign the next to next pointer to second pointer which will delete the second next pointer from the list.

public class DeleteNthNode {

	public ListNode delete(ListNode head, int n) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;
		
		for(int i=0;i<n;i++) {
			first = first.next;
		}
		
		while(first.next!=null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}
	
	public static void main(String[] args) {
		
		DeleteNthNode d = new DeleteNthNode();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode res = d.delete(head, 2);
		
		while(res!=null)
		{
			System.out.println(res.data);
			res = res.next;
		}
		
	}
}
