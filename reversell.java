// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func reverseList(_ head: ListNode?) -> ListNode? {
        var node1 : ListNode?
        var node2 = head
        var node3 = head?.next
        while node2 != nil {
            node2?.next = node1
            node1 = node2
            node2 = node3
            node3 = node3?.next
        }
        return node1
    }