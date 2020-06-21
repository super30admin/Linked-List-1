// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//Have three pointer prev, current and fast. first reverse current pointer then move the prev and current. Move a fast pointer to next

class Solution {
    func reverseList(_ head: ListNode?) -> ListNode? {
        var prev:ListNode? = nil
        var current = head
        var fast = head?.next
        
        while(current != nil) {
            current?.next = prev
            prev = current
            current = fast 
            fast = fast?.next
        }
        return prev
    }
}