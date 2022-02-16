#Time Complexity : O(n) time
#Space Complexity : O(1) space, in place
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        previous = None
        current = head
        fast = head.next
        
        while(fast is not None):
            current.next = previous
            previous = current
            current = fast
            fast = fast.next
        current.next = previous
        return current
