package main

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

/*

1st - using hash map, when you encounter the same address in hashmap when we know that its a cycle

2nd - using fast and slow pointers
slow moves 1x speed
fast moves 2x speed

cycle will be detected when slow and fast pointer meet
at that point we start another iteration and move slow pointer to head of the LL and continue until the pointers meet

*/

// Time : O(n) - worst case we iterate over the entore LL in the first pass
// Space : O(1) - not using aux space for anything
func detectCycle(head *ListNode) *ListNode {

	slow := head
	fast := head
	// boolean to detect cycle
	cycle := false
	// fast is going to be nil first as its moving fast
	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
		if fast == slow {
			// exit as soon as we find a cycle
			cycle = true
			break
		}
	}

	// is cycle is not yet true exit
	if cycle == false {
		return nil
	}

	// move slow to head agin
	slow = head
	for slow != fast {
		slow = slow.Next
		fast = fast.Next
	}
	return slow
}
