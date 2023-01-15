package main

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

/*

1-->2-->3-->nil
1.next = 2
2.next = 3
3.next = nil

3-->2-->1-->nil
this needs to become
1.next = nil
2.next = 1
3.next = 2


so if current element is 1, its previous is nil and its next is 2
now, 1.next = previous (nil); current = next and next moves on to next.next

*/

//Time : O(n) - next iretrates over n-1 elements in the given linked list
//Space : O(1)

func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	current := head
	var prev *ListNode
	next := head.Next

	for next != nil {
		current.Next = prev
		prev = current
		current = next
		next = next.Next
	}
	// when loop exist next is nil, current is 5 and prev is 4 and hence need point 5.next to 4
	current.Next = prev
	return current
}
