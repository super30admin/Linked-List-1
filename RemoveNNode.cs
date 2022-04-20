// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// // Your code here along with comments explaining your approach
// 	3) We use two pointers, slow and fast
// 		a. We take count and move fast pointer by until count <= n
// 		b. We move fast pointer, increment count by 1
// 		c. Keep doing it until count <= n
// 		d. Now move slow anf fast both until fast == null
// 		e. Then update slow = slow.next.next to remove element
// When fast pointer reach end, we adjust slow pointer to next next


public ListNode RemoveNthFromEnd(ListNode head, int n) {
        
    if(head == null)
        return null;
    
    int count = 0;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    
    while(count <= n)
    {
        fast = fast.next;
        count++;
    }
    
    while(fast != null)
    {
        slow = slow.next;
        fast = fast.next;
    }
    
    slow.next = slow.next.next;
    
    return dummy.next;
}