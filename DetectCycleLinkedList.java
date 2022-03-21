// Time Complexity : O(n)
// Space Complexity : O(1)
class DetectCycleLinkedList{
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode detectCycle(ListNode head) {		
		if(head==null) return null;
		
		boolean flag= false; //flag to determine if cycle found or not
		ListNode slow= head;
		ListNode fast= head;//at 2x speed of slow
		
		
		while(fast!=null && fast.next!=null) {			
			slow=slow.next;
			fast=fast.next; 	
			
			if(slow==fast) {
				flag=true;
				break;
			}
		}		
		if(!flag) return null;//return null if no cycle found
		
		//else find index where the cycle starts
		fast=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next; 
		}
		return slow;		
	}
}