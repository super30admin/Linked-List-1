// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : used brute force approch before class 

// Your code here along with comments explaining your approach

//take two pointers and  create a difference of k between them 
// then move the ahead pointer till the end so the slow pointer will be at point before the actual k node to delete
// delete node by pointing slow pointers next to its next.next
// take dummy node and points its next to rhead return that

public class Problem2 {
	  public ListNode removeNthFromEnd(ListNode head, int n) {
		  
		        
		         ListNode dummy = new ListNode(0);
		    dummy.next = head;
		    ListNode first = dummy;
		    ListNode second = dummy;
		    // Advances first pointer so that the gap between first and second is n nodes apart
		    for (int i = 1; i <= n + 1; i++) {
		        first = first.next;
		    }
		    // Move first to the end, maintaining the gap
		    while (first != null) {
		        first = first.next;
		        second = second.next;
		    }
		    second.next = second.next.next;
		    return dummy.next;
		}
}
