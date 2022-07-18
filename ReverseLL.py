// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if not head :
            return

        curr = head
        prev = None

        while curr:
            next_ = curr.next
            curr.next = prev
            prev = curr
            curr = next_

        return prev
