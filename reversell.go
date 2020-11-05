// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
create dummy rev node
while head != nil
set temp node as head
move head to next
set temp of next to rev.next
set rev.next as temp

return rev.next
*/
package main

import "fmt"

type ListNode struct {
	Val int
	Next *ListNode
}

//iterative
/*func reverseList(head *ListNode) *ListNode {
	rev := &ListNode{Val: -1}
	for head != nil {
		x:= head
		head = head.Next
		x.Next = rev.Next
		rev.Next = x
	}
	return rev.Next
}*/

func reverseList(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}
	return h(head, nil)
}

func h(head, r *ListNode) *ListNode {
	if head == nil {
		return r
	}

	x := head.Next
	head.Next = r
	r = head
	return h(x, r)
}

func MainReverse() {
	node1 := &ListNode{Val: 5}
	node2 := &ListNode{Val: 4, Next: node1}
	node3 := &ListNode{Val: 3, Next: node2}
	node4:= &ListNode{Val: 2, Next: node3}
	head := &ListNode{Val: 1, Next: node4}
	fmt.Println(reverseList(head))
}

