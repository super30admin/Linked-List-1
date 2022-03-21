// Time Complexity : O(n)
// Space Complexity : O(1)
class ReverseLinkedList{
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode reverseList(ListNode head) {
		//Approach1: Iterative
		if(head==null || head.next==null) return head;
		ListNode prev= null;
		ListNode curr= head;
		ListNode fast= head.next;		
		while(fast!=null) {			
			curr.next= prev;//reverse the direction
			prev=curr; 
			curr=fast;
			fast=fast.next;
		}		
		curr.next= prev; //reverse the direction of last element
		return curr;
		
		//Approach2: Recursive| Time O(n)| Space O(n)
		/*if(head==null || head.next==null) return head;
		ListNode node= reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return node;*/
	}
	
	//Driver Code
	public static void main(String[] args) {
		ReverseLinkedList ob= new ReverseLinkedList();
		ListNode l1= new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));				
		ListNode revlist=ob.reverseList(l1);
		
		System.out.print("Reversed linked list :");	
		while(revlist!=null) {
			System.out.print("\t"+revlist.val);
			revlist=revlist.next;
		}
	}
}