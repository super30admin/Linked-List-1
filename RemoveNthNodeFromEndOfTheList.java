package linkedList1;

public class RemoveNthNodeFromEndOfTheList {
	//Time Complexity : O(n), where n is the length of linked list
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
		
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
	
	//Time Complexity : O(n), where n is the length of linked list
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode();
        int count = 0;
        dummy.next = head;
        ListNode curr = head;
        
        while(curr != null) {
            curr = curr.next;
            count++;
        }
        
        count -= n;
        curr = dummy;
        while(count > 0) {
            curr = curr.next;
            count--;
        }
        
        curr.next = curr.next.next;
        return dummy.next;
    }
}
