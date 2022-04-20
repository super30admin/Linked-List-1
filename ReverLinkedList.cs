// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
	// 2) Three pointers - previous, current, fast
	// 3) We need to point current to previous
	// 4) Weo iterate over until fast != null
	// 	a. Current.next = prev
	// 	b. Now move to next step, move all pointers
	// 	c. Prev = current
	// 	d. Current = fast
	// 	e. Fast = fast.next
	// 5) Return current which is head of reversed linked list
  public ListNode ReverseList(ListNode head) {
    if(head == null || head.next == null)
        return head;

    ListNode curr = head;
    ListNode prev = null;
    ListNode fast = head.next;

    while(fast != null)
    {
        curr.next = prev;
        prev = curr;
        curr = fast;
        fast = fast.next;
    }
    
    //we do this curr next = prev because current is not tied to prev
    curr.next = prev;
    return curr;

  }