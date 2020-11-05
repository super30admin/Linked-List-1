// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
create dummy node before head
set slow, fast to dummy
move the fast n+1 times
after that move both till fast != nil
set slow.next = slow.next.next
return dummy.next
*/
package main

import "fmt"

func removeNthFromEnd(head *ListNode, n int) *ListNode {
	dummy := &ListNode{Val: -1, Next: head}
	slow := dummy
	fast := dummy
	for  i := 0;i<=n;i++ {
		fast = fast.Next
	}
	for fast!= nil {
		slow= slow.Next
		fast=fast.Next
	}
	slow.Next = slow.Next.Next
	return dummy.Next
}

func MainRemoveNFromBack() {
	node1 := &ListNode{Val: 5}
	node2 := &ListNode{Val: 4, Next: node1}
	node3 := &ListNode{Val: 3, Next: node2}
	node4:= &ListNode{Val: 2, Next: node3}
	head := &ListNode{Val: 1, Next: node4}
	x := removeNthFromEnd(head, 2)
	fmt.Println(x) //expected 1235
}
