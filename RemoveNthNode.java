// Time Complexity : O(n)
// Space Complexity : O(1)
class RemoveNthNode{
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null) return head;
		
		ListNode dummy= new ListNode(-1);
		ListNode curr= dummy;
		ListNode fast= dummy;	
		dummy.next=head;	
		//move right before the node to be removed
		for(int i=0; i<n; i++) {
			fast=fast.next;
		}
				
		while(fast.next!=null) {			
			curr=curr.next;
			fast=fast.next; 			
		}		
		curr.next= curr.next.next; //remove the node
		return dummy.next;		
	}
	
	//Driver Code
	public static void main(String[] args) {
		RemoveNthNode ob= new RemoveNthNode();
		//ListNode head= new ListNode(1);
		ListNode head= new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));				
		int n=2;	
		
		System.out.print("List after removing "+n+"th element from end of the linked list:");	
		ListNode list=ob.removeNthFromEnd(head,n);
		while(list!=null) {
			System.out.print("\t"+list.val);
			list=list.next;
		}
	}
}