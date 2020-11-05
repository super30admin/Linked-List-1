// Time Complexity : O(n) **IMP
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
floyd's algorithm
start slow, fast pointer from head move by 1, 2 respectively
if at any point they meet then cycle exists
if they meet set slow to head and move both by 1 the point that they meet is the intersection point
*/
package main

import "fmt"

func detectCycle(head *ListNode) *ListNode {
	slow := head
	fast := head
	for fast != nil && fast.Next != nil{
		slow = slow.Next
		fast = fast.Next.Next
		if slow == fast {
			slow = head
			for slow != fast {
				slow = slow.Next
				fast = fast.Next
			}
			return slow
		}
	}
	return nil
}

func MainCycle() {
	node1 := &ListNode{Val: -4}
	node2 := &ListNode{Val: 0, Next: node1}
	node3 := &ListNode{Val: 2, Next: node2}
	head:= &ListNode{Val: 3, Next: node3}
	node1.Next = node3
	fmt.Println(detectCycle(head)) //expected 2
}
