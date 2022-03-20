package main

import "fmt"

func main() {
	fmt.Println("vim-go")
}

/*
   Approach 1:

   time: o(n)
   space: o(n)

   - Using a hashmap
   - Store each node ref as a key in hashmap
   - if we run into a node that already exists in our hashmap, that means there is a cycle


*/
func detectCycle(head *ListNode) *ListNode {

	if head == nil || head.Next == nil {
		return nil
	}
	m := map[*ListNode]struct{}{}
	current := head
	for current != nil {
		_, seen := m[current]
		if seen {
			return current
		}
		m[current] = struct{}{}
		current = current.Next
	}
	return nil
}
