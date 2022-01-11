package linkedList1;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
	//Time Complexity : O(n), where n is the length of linked list
	//Space Complexity : O(n), for set
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
		
	public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        
        while(head != null) {
            if(set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }
        
        return null;
    }
}
