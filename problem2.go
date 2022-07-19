
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

//TC - O(N)
//SC - O(1)

func removeNthFromEnd(head *ListNode, n int) *ListNode {
    if head == nil || n == 0{
        return nil
    }
    
    dummy := &ListNode{}
    dummy.Next = head
    
    slow := dummy
    fast := dummy
    
    count := 0
    
    for count <= n{
        count+=1
        fast = fast.Next
    }
    
    for fast != nil{
        slow = slow.Next
        fast = fast.Next
    }
    
    slow.Next = slow.Next.Next
    
    return dummy.Next
}
