/*time complexity : O(n)
Space Complexity : O(1)*/

package Linked_List_1

func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	reversed := reverseList(head.Next)
	head.Next.Next = head
	head.Next = nil
	return reversed
}
