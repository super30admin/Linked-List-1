
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
//TC O(N)
//SC O(1)

func detectCycle(head *ListNode) *ListNode {
    if head == nil{
        return nil
    }
    
    slow  := head
    fast := head
    hascycle := false
    for fast != nil && fast.Next != nil{
        slow = slow.Next
        fast = fast.Next.Next
        if slow == fast{
            hascycle = true
            break
        }
    }
    
    
    if hascycle == false{
        return nil
    }
    
    slow = head 
    
    for slow != fast{
        slow = slow.Next
        fast = fast.Next
    }
    
    return slow
}
