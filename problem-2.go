/*
time complexity : O(n)
space complexity : O(1)
*/
package Linked_List_1

func removeNthFromEnd(head *ListNode, n int) *ListNode {
	dummyHead := &ListNode{-1, head}
	slow := dummyHead
	fast := dummyHead
	counter := 0
	for counter < n {
		fast = fast.Next
		counter++
	}
	for fast.Next != nil {
		slow = slow.Next
		fast = fast.Next
	}
	slow.Next = slow.Next.Next
	return dummyHead.Next
}
