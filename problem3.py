# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow, fast = head,head
        if not head:
            return None
        if not slow.next:
            return None
        slow = slow.next
        if fast.next:
            fast = fast.next.next
        else:
            return None

        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
        
        if not fast:
            return None
        
        slow = head

        while fast and slow != fast:
            slow = slow.next
            fast = fast.next
        
        if slow != fast:
            return None
        
        return slow