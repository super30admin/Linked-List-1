/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

// approach: iterative using curr and prev ptr
// time: o(n)
// space: o(1)
// func reverseList(head *ListNode) *ListNode {
//     var prev *ListNode
//     curr := head
//     for curr != nil {
//         next := curr.Next
//         curr.Next = prev
//         prev = curr
//         curr = next
//     }
//     return prev
// }

// approach: recursive
// time: o(n)
// space: o(n)
func reverseList(head *ListNode) *ListNode {
    var dfs func(h *ListNode) *ListNode
    dfs = func(h *ListNode) *ListNode {
        // base
        if h == nil || h.Next == nil {
            // we are tail, i.e the new head, return this as its our new head
            return h
        }
        // logic
        // take the tail end as is and keep returning it!
        tail := dfs(h.Next)
        h.Next.Next = h
        h.Next = nil
        return tail
    }
    
    return dfs(head)
}
