// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func removeNthFromEnd(_ head: ListNode?, _ n: Int) -> ListNode? {
        var dummy = ListNode(-1,head)
        var n = n
        var node1: ListNode? = dummy
        var node2: ListNode? = dummy
        while n > 0 {
            node2 = node2?.next
            n -= 1
        }
        while node2?.next != nil {
            node2 = node2?.next
            node1 = node1?.next
        }
        node1?.next = node1?.next?.next
        return dummy.next
    }