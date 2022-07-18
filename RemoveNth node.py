// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return None
        first = head
        second = head

        while second and n>0:
            second = second.next
            n -= 1
        if second is None:
            return head.next

        while second.next:
            second = second.next
            first = first.next

        first.next = first.next.next

        return head