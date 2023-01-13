/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
// approach: hashset + single ptr
//    - if there is a cycle; a node will try to get added to set again ( which we have already seen )
//    - otherwise ptr will reach null and that will be the end of that
// time: o(n)
// space: o(n)
// func detectCycle(head *ListNode) *ListNode {
//     curr := head
//     set := map[*ListNode]bool{}
//     for curr != nil{
//         if _, ok := set[curr]; ok {return curr}
//         set[curr] = true
//         curr = curr.Next
//     }
//     return curr
// }

// time: o(n)
// space: o(1)
func detectCycle(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {return nil}

    slow := head
    fast := head
    for fast != nil && fast.Next != nil {
        fast = fast.Next.Next
        slow = slow.Next
        if fast == slow {break}
    }
    // no cycle detected ( fast could be nil or at the tail, check both cases )
    if fast == nil || fast.Next == nil {return nil}
    
    slow = head
    for slow != fast {
        slow = slow.Next
        fast = fast.Next
    }
    return slow
}
