
// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseList(head *ListNode) *ListNode {
    if head == nil{
        return nil
    }
    
    curr := head
    var prev *ListNode 
    var next *ListNode
    
    for  curr != nil{
        next = curr.Next
        curr.Next = prev
        prev = curr
        curr = next
    }
    
    return prev
}


//Approach 2
//TC - O(N)
//SC - O(N)
// func reverseList(head *ListNode) *ListNode {
//     if head == nil || head.Next == nil{
//         return head
//     }
    
//     reversed := reverseList(head.Next)
    
//     head.Next.Next = head
//     head.Next = nil
    
//     return reversed
    
// }


