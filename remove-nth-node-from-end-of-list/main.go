package main

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

/*

Brute Force - 2 pass, one to find the length and then using the length you can
find the nth element

O(n) - create a gap n between two pointers
- advance pointer
- lagging pointer

you start the slow pointer when fast pointer - slow pointer = n

*/

// One Pass with Dummy Pointer
// Time : O(n)
// Space : O(1)
func removeNthFromEnd(head *ListNode, n int) *ListNode {
	if head == nil {
		return nil
	}
	// dummy end up just storing the address that we have to return
	// for this dry run a case of [1] where you have to remove 1 element and it comes to picture.
	dummy := ListNode{
		Next: head,
	}
	//dummy.Next = head
	//return nil
	slow := &dummy
	fast := &dummy
	count := 0
	for count <= n {
		count++
		fast = fast.Next
	}

	for fast != nil {
		slow = slow.Next
		fast = fast.Next
	}
	temp := slow.Next
	slow.Next = slow.Next.Next
	temp.Next = nil
	return dummy.Next

}

// // One Pass Approach
// func removeNthFromEnd(head *ListNode, n int) *ListNode {
//     if head == nil {
//         return nil
//     }
//     if head.Next == nil && n == 1{
//         return nil
//     }
//     slow := head
//     fast := head
//     // start a loop and move fast pointer n steps ahead
//     for i:=1; i<=n; i++{
//         fast = fast.Next
//     }

//     // removing head - we are alredy past the last element in LL
//     if fast == nil {
//         temp := head.Next
//         head.Next = nil
//         head = temp
//         return head
//     }
//     // now we are basically traversing to the n-1 element in the linkedlist
//     for fast.Next != nil {
//         slow = slow.Next
//         fast = fast.Next
//     }
//     // at this point i am at 3
//     temp := slow.Next // 4
//     slow.Next = slow.Next.Next
//     temp.Next = nil
//     return head
// }

// Brute Force :
// Time : O(n) + O(n)
// func removeNthFromEnd(head *ListNode, n int) *ListNode {

//     current := head
//     count := 0
//     // length of LinkedList
//     for current != nil {
//         count++
//         current = current.Next
//     }

//     if count == 1 && n == 1{
//         return nil
//     }

//     current = head
//     elementToRemove := count - n + 1
//     for i:=1; i <= count; i++{
//         if i == 1 && i == elementToRemove{
//             // we are at first element of the linked list and hence the edge case
//             // head also needs to be moved
//             temp := current.Next
//             current.Next = nil
//             head = temp
//             break
//         }
//         if i+1 == elementToRemove {
//             temp := current.Next.Next
//             current.Next.Next = nil
//             current.Next = temp
//             break
//         }
//         current = current.Next
//     }
//     return head
// }

// func removeNthFromEnd(head *ListNode, n int) *ListNode {

//     dummy := ListNode{}
//     fast := dummy
//     slow := dummy
//     count := 0
//     for count <= n {
//         count++
//         fast = fast.next
//     }
//     for fast != null{
//         slow = slow.next
//         fast = fast.next
//     }
// }

// func removeNthFromEnd(head *ListNode, n int) *ListNode {

//     dummy := ListNode{}
//     fast := dummy
//     slow := dummy
//     count := 0
//     for count <= n {
//         count++
//         fast = fast.next
//     }
//     for fast != null{
//         slow = slow.next
//         fast = fast.next
//     }
// }