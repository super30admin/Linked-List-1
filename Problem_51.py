# Time complexity: O(n) with one pass
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummy = ListNode(-1)
        dummy.next = head
        if not head or not head.next:
            return None
        
        slow = dummy
        fast = dummy
        
        idx = 0
        while idx<=n:
            fast = fast.next
            idx += 1
        
        while(fast):
            slow = slow.next
            fast = fast.next
        
        slow.next = slow.next.next
        
        return dummy.next