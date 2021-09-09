# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: keep 2 pointers, 
# fast and slow, and create a gap of 'n' between fast and slow
# once the gap is created, advance slow and fast by one till fast is not None
# once fast is None, slow is at the exact position and slow's next is to be deleted
# so we do slow.next = slow.next.next


class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:

    def removeNthFromEnd(self, head, n):

        dummy = ListNode(-1)
        dummy.next = head
        count = 0
        slow = dummy
        fast = dummy

        while count <= n:
            fast = fast.next
            count += 1
        
        while fast is not None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next

