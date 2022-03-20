package main

import "fmt"

/*

Approach 1

space: o(n)
time: o(n)

We can implement stack as a linked list.
So go thru each node and push them to a "stack using LL"
i.e push each node to the head/top
*/
func reverseUsingStack(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	var stack *ListNode
	current := head
	for current != nil {
		newHead := &ListNode{Val: current.Val}
		if stack == nil {
			stack = newHead
		} else {
			newHead.Next = stack
			stack = newHead
		}
		current = current.Next
	}
	return stack
}

/*

Approach 2

space: o(1)
time: o(n)

reverse in place using 2 pointers ( current and prev)
(H)1->2->3->4
1<-2<-3<-4(H)
*/
func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	var prev *ListNode
	current := head
	for current != nil {
		next := current.Next
		current.Next = prev
		prev = current
		current = next
	}
	return prev
}

func printLL(head *ListNode) {
	if head == nil || head.Next == nil {
		return
	}
	msg := ""
	current := head
	for current != nil {
		msg += fmt.Sprintf("%v", current.Val)
		if current.Next != nil {
			msg += "->"
		}
		current = current.Next
	}
	fmt.Println(msg)
}

type ListNode struct {
	Val  int
	Next *ListNode
}

func main() {
	ll := &ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 3, Next: &ListNode{Val: 4}}}}
	llRev := reverseUsingStack(ll)
	printLL(llRev)
	printLL(ll)

	// in place
	ll = reverseList(ll)
	printLL(ll)

}
