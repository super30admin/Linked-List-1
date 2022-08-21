# Time Complexity :O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if head is None:
            return None
        slow = head
        fast = head
        while fast.next is not None and fast.next.next is not None :
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                entry = head
                while slow != entry:
                    slow = slow.next
                    entry = entry.next
                return entry
        return None