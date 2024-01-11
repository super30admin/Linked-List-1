/*time complexity : O(n)
space complexity : O(1)*/

func detectCycle(head *ListNode) *ListNode {
	flag := false
	slow := head
	fast := head
	for fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
		if slow == fast {
			flag = true
			break
		}
	}
	if flag == false {
		return nil
	}

	slow = head
	for slow != fast {
		slow = slow.Next
		fast = fast.Next
	}
	return slow
}
