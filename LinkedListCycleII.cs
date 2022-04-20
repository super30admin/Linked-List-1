// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
	// 	2) We use slow and fast pointer
	// 	a. Slow pointer moves one step
	// 	b. Fast pointer moves two pointer
	// 3) At some point fast and slow pointer comes to same element, that it means we have cycle.
	// 4) But no guarantee it will meet at start of cycle
	// 5) To find Start of cycle, when they meet, rewind either slow or fast to start of cycle
	// 	a. Then increase slow by one and fast by 1, now they will meet at start of cycle.
	// 6) TC O(n+n) => O(n)
	// 7) SC O(1)
	// 8) Why they always meet - because one is running twice the speed of other, it will meet at some point
	// 9) Why they will meet at start of cycle after rewind? Because mathematically a = c, below :


public ListNode DetectCycle(ListNode head) {
        
    if(head == null)
        return null;
    

    ListNode slow = head;
    ListNode fast = head;
    bool hasCycle = false;

    while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
        {
            hasCycle = true;
            break;
        }
    }

    if(!hasCycle)
        return null;
    
    slow = head;
    while(slow != fast)
    {
        slow = slow.next;
        fast = fast.next;
    }

    return slow;
}